package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import javax.print.DocFlavor;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    ObservableList<ToDoItem> items = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField text;


    public void addItem() {
       // System.out.println("addItem");
        items.add(new ToDoItem(text.getText()));
        text.setText("");
    }

    public void removeItem() {
       // System.out.println("removeItem");
        ToDoItem item = (ToDoItem) list.getSelectionModel().getSelectedItem();
        items.remove(item);
    }

    public void toggleItem() {
        //System.out.println("toggleItem");
        ToDoItem item = (ToDoItem) list.getSelectionModel().getSelectedItem();

        if (item != null);{
            item.isDone = !item.isDone;
            list.refresh();

        }
    }


    @Override
    public void initialize(URL Location, ResourceBundle resources) {
        list.setItems(items);
    }
}