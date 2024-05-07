package org.example.App.client;

import com.google.gson.Gson;
import org.example.App.currency.CurJson;
import org.example.App.currency.JsonDetails;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;


/// @brief клиент json
/// @details этот класс осуществляет работу с json:
/// скачивает, парсит, добавляет в массив
public class JsonHttpsClient{
    private static int curNum = 0;//номер элемента, который загрузили последним

    private final String CUR_URL = "https://dummyjson.com/products";
    private static ArrayList<JsonDetails> products = new ArrayList<>();//массив загруженных элементов

    public synchronized CurJson getCurrencies(){
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(CUR_URL+"?skip="+(curNum)+"&limit=20"))
                .GET()
                .build();
        curNum+=20;
        HttpResponse<String> response = null;
        try{
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        }catch (IOException|InterruptedException e){
            throw new RuntimeException(e);
        }
        var gson = new Gson();
        var currencies = gson.fromJson(response.body(), CurJson.class);

        products.addAll(currencies.products());

        return currencies;
    }

    public static ArrayList<JsonDetails> getProducts() {
        return products;
    }

    public static int getCurNum() {
        return curNum;
    }

    public static void setCurNum(int curNum) {
        JsonHttpsClient.curNum = curNum;
    }
}
