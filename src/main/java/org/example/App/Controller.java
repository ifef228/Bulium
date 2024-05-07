package org.example.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import org.example.App.client.JsonHttpsClient;
import org.example.App.client.ProductsDownloadThread;
import org.example.App.currency.JsonDetails;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private Button nxtButton;
    @FXML
    private Button prvButton;
    @FXML
    private ProgressIndicator processInd;
    @FXML
    private TextField description;

    @FXML
    private TextField description1;

    @FXML
    private TextField description2;

    @FXML
    private TextField description3;
    @FXML
    private TextField description4;

    @FXML
    private TextField description5;

    @FXML
    private TextField description6;

    @FXML
    private TextField description7;
    @FXML
    private TextField description8;

    @FXML
    private TextField description9;

    @FXML
    private TextField description10;

    @FXML
    private TextField description11;
    @FXML
    private TextField description12;

    @FXML
    private TextField description13;

    @FXML
    private TextField description14;

    @FXML
    private TextField description15;
    @FXML
    private TextField description16;

    @FXML
    private TextField description17;

    @FXML
    private TextField description18;

    @FXML
    private TextField description19;

    @FXML
    private ImageView image;

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;
    @FXML
    private ImageView image4;

    @FXML
    private ImageView image5;

    @FXML
    private ImageView image6;

    @FXML
    private ImageView image7;
    @FXML
    private ImageView image8;

    @FXML
    private ImageView image9;

    @FXML
    private ImageView image10;

    @FXML
    private ImageView image11;
    @FXML
    private ImageView image12;

    @FXML
    private ImageView image13;

    @FXML
    private ImageView image14;

    @FXML
    private ImageView image15;
    @FXML
    private ImageView image16;

    @FXML
    private ImageView image17;

    @FXML
    private ImageView image18;

    @FXML
    private ImageView image19;

    @FXML
    private Text title;

    @FXML
    private Text title1;

    @FXML
    private Text title2;

    @FXML
    private Text title3;
    @FXML
    private Text title4;

    @FXML
    private Text title5;

    @FXML
    private Text title6;

    @FXML
    private Text title7;
    @FXML
    private Text title8;

    @FXML
    private Text title9;

    @FXML
    private Text title10;

    @FXML
    private Text title11;
    @FXML
    private Text title12;

    @FXML
    private Text title13;

    @FXML
    private Text title14;

    @FXML
    private Text title15;
    @FXML
    private Text title16;

    @FXML
    private Text title17;

    @FXML
    private Text title18;

    @FXML
    private Text title19;
    ArrayList<JsonDetails> products;
    @FXML
    void showNextClick() throws InterruptedException {
        processInd.setVisible(true);
        nxtButton.setDisable(true);
        ProductsDownloadThread thread = new ProductsDownloadThread();
        thread.start();
        thread.join();
        setPage();
        prvButton.setDisable(false);
    }
    @FXML
    void showPreviousClick(ActionEvent event) {
        processInd.setVisible(true);
        nxtButton.setDisable(true);
        JsonHttpsClient.setCurNum(JsonHttpsClient.getCurNum()-20);
        setPage();
    }

    private void setPage(){
        if (JsonHttpsClient.getCurNum()>20){
            prvButton.setDisable(false);
        }else {
            prvButton.setDisable(true);
        }
        processInd.setVisible(false);
        nxtButton.setDisable(false);
        products = JsonHttpsClient.getProducts();
        int cur = JsonHttpsClient.getCurNum();
        try {
            image.setImage(new Image(String.valueOf(products.get(0 + cur - 20).thumbnail())));
            image1.setImage(new Image(String.valueOf(products.get(1 + cur - 20).thumbnail())));
            image2.setImage(new Image(String.valueOf(products.get(2 + cur - 20).thumbnail())));
            image3.setImage(new Image(String.valueOf(products.get(3 + cur - 20).thumbnail())));
            image4.setImage(new Image(String.valueOf(products.get(4 + cur - 20).thumbnail())));
            image5.setImage(new Image(String.valueOf(products.get(5 + cur - 20).thumbnail())));
            image6.setImage(new Image(String.valueOf(products.get(6 + cur - 20).thumbnail())));
            image7.setImage(new Image(String.valueOf(products.get(7 + cur - 20).thumbnail())));
            image8.setImage(new Image(String.valueOf(products.get(8 + cur - 20).thumbnail())));
            image9.setImage(new Image(String.valueOf(products.get(9 + cur - 20).thumbnail())));
            image10.setImage(new Image(String.valueOf(products.get(10 + cur - 20).thumbnail())));
            image11.setImage(new Image(String.valueOf(products.get(11 + cur - 20).thumbnail())));
            image12.setImage(new Image(String.valueOf(products.get(12 + cur - 20).thumbnail())));
            image13.setImage(new Image(String.valueOf(products.get(13 + cur - 20).thumbnail())));
            image14.setImage(new Image(String.valueOf(products.get(14 + cur - 20).thumbnail())));
            image15.setImage(new Image(String.valueOf(products.get(15 + cur - 20).thumbnail())));
            image16.setImage(new Image(String.valueOf(products.get(16 + cur - 20).thumbnail())));
            image17.setImage(new Image(String.valueOf(products.get(17 + cur - 20).thumbnail())));
            image18.setImage(new Image(String.valueOf(products.get(18 + cur - 20).thumbnail())));
            image19.setImage(new Image(String.valueOf(products.get(19 + cur - 20).thumbnail())));


            title.setText(products.get(0 + cur - 20).title());
            title1.setText(products.get(1 + cur - 20).title());
            title2.setText(products.get(2 + cur - 20).title());
            title3.setText(products.get(3 + cur - 20).title());
            title4.setText(products.get(4 + cur - 20).title());
            title5.setText(products.get(5 + cur - 20).title());
            title6.setText(products.get(6 + cur - 20).title());
            title7.setText(products.get(7 + cur - 20).title());
            title8.setText(products.get(8 + cur - 20).title());
            title9.setText(products.get(9 + cur - 20).title());
            title10.setText(products.get(10 + cur - 20).title());
            title11.setText(products.get(11 + cur - 20).title());
            title12.setText(products.get(12 + cur - 20).title());
            title13.setText(products.get(13 + cur - 20).title());
            title14.setText(products.get(14 + cur - 20).title());
            title15.setText(products.get(15 + cur - 20).title());
            title16.setText(products.get(16 + cur - 20).title());
            title17.setText(products.get(17 + cur - 20).title());
            title18.setText(products.get(18 + cur - 20).title());
            title19.setText(products.get(19 + cur - 20).title());


            description.setText(products.get(0 + cur - 20).description());
            description1.setText(products.get(1 + cur - 20).description());
            description2.setText(products.get(2 + cur - 20).description());
            description3.setText(products.get(3 + cur - 20).description());
            description4.setText(products.get(4 + cur - 20).description());
            description5.setText(products.get(5 + cur - 20).description());
            description6.setText(products.get(6 + cur - 20).description());
            description7.setText(products.get(7 + cur - 20).description());
            description8.setText(products.get(8 + cur - 20).description());
            description9.setText(products.get(9 + cur - 20).description());
            description10.setText(products.get(10 + cur - 20).description());
            description11.setText(products.get(11 + cur - 20).description());
            description12.setText(products.get(12 + cur - 20).description());
            description13.setText(products.get(13 + cur - 20).description());
            description14.setText(products.get(14 + cur - 20).description());
            description15.setText(products.get(15 + cur - 20).description());
            description16.setText(products.get(16 + cur - 20).description());
            description17.setText(products.get(17 + cur - 20).description());
            description18.setText(products.get(18 + cur - 20).description());
            description19.setText(products.get(19 + cur - 20).description());
        }catch (Exception e){
            nxtButton.setDisable(true);
            JsonHttpsClient.setCurNum(JsonHttpsClient.getCurNum()-20);
        }
    }

    @Override
    public void initialize(URL loc, ResourceBundle resources){
        ProductsDownloadThread downloadThread = new ProductsDownloadThread();
        downloadThread.start();
        prvButton.setDisable(true);
        try {
            downloadThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        setPage();
    }
}