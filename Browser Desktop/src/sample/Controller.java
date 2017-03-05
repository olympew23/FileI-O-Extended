package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;


import java.net.URL;
import java.util.ResourceBundle;

//import java.awt.event.KeyEvent;

public class Controller implements Initializable, ChangeListener {


    @FXML
    TextField addressBar;


    @FXML
    WebView webView;

    public void goTOUrl() {
        //System.out.println("goTOUrl");
        String url = addressBar.getText();

        if (!url.startsWith("http")) {
            url = "http://" + url;
        }

        webView.getEngine().load(url);
    }


    public void goBack() {
        // System.out.println("goBack");

        try {
            webView.getEngine().getHistory().go(-1);
        } catch (Exception e) {

        }
    }

    public void goForward() {
        // System.out.println("goForward");
        try {
            webView.getEngine().getHistory().go(1);
        } catch (Exception e) {
        }


    }

    public void oneKeyPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            goTOUrl();
        }
    }

    @Override
    public void initialize(URL Location, ResourceBundle resources) {
        Worker worker = webView.getEngine().getLoadWorker();
        worker.stateProperty().addListener(this);

    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        addressBar.setText(webView.getEngine().getLocation());


    }
}