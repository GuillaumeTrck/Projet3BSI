package com.projet3bsi.projet3bsi;

import com.projet3bsi.projet3bsi.Controlers.PatientsOverviewController;
import com.projet3bsi.projet3bsi.Models.Patients;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class CareApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(CareApplication.class.getResource("unit-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Services");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch();
    }

}