package org.example.App.client;

import org.example.App.Controller;

///@brief загрузчик
// @details этот класс скачивает по 20 элементов в массив products класса JsonHttpsClient
public class ProductsDownloadThread extends Thread{
    @Override
    public void run() {
        new JsonHttpsClient().getCurrencies();
    }
}
