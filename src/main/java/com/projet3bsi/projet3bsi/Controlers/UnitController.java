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
                        FXMLLoader fxmlUnitPeople = new FXMLLoader(CareApplication.class.getResource("unit-people-view.fxml"));

                        Scene scene = null;
                        try {
                            scene = new Scene(fxmlUnitPeople.load(), 320, 240);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        // get controller associated with the view
                        UnitPatientsController unitPatientsController = fxmlUnitPeople.getController();
                        // set the current unit care
                        unitPatientsController.setListView(newValue);



                        Stage mainWindow; //Here is the magic. We get the reference to main Stage.
                        mainWindow = (Stage) Window.getWindows().get(0);
                        mainWindow.setScene(scene); //here we simply set the new scene


                    }

                });

    }


}