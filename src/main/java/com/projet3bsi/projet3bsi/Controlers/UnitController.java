package com.projet3bsi.projet3bsi.Controlers;

import com.projet3bsi.projet3bsi.CareApplication;
import com.projet3bsi.projet3bsi.Models.UnitCare;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Crée l'objet observablelist ainsi qu'une ListView
 * @author Guillaume
 * @version  1.0
 */
public class UnitController {
    @FXML
    private ListView<String> listView = new ListView<String>();
    private Set<String> stringSet;
    ObservableList observableList = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        setListView();

    }

    public UnitController()
    {

    }

    /**
     * Permet de charger la liste des unités de soins
     * @author Theo
     * @version  1.0
     */
    public void setListView()
    {
        UnitCare unitCare = new UnitCare();
        HashSet<String> unitCareList = unitCare.getUnitCares();

        observableList.setAll(unitCareList);
        listView.setItems(observableList);

        // initialisation de l'écouteur du changement d'élément de la liste
        listView.getSelectionModel().selectedItemProperty()
                .addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                        // Your action here

                        System.out.println("Selected item: " + newValue);
                        FXMLLoader fxmlLogin= new FXMLLoader(CareApplication.class.getResource("Login.fxml"));

                        Scene scene = null;
                        try {
                            scene = new Scene(fxmlLogin.load(), 320, 240);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                         //get controller associated with the view
                        LoginController loginController = fxmlLogin.getController();
                         //set the current unit care
                        loginController.SetCurrentUnitCare(newValue);


                        Stage mainWindow; //Here is the magic. We get the reference to main Stage.
                        mainWindow = (Stage) Window.getWindows().get(0);
                        mainWindow.setTitle("Login");
                        mainWindow.setScene(scene); //here we simply set the new scene


                    }

                });

    }


}