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


    public void showPatientsOverview() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(CareApplication.class.getResource("view/PersonOverview.fxml"));
            AnchorPane patientsOverview = (AnchorPane) loader.load();
            //rootLayout.setCenter(patientsOverview);
            PatientsOverviewController controller = loader.getController();
            //controller.setCareApplication(this);
            Scene scene = null;
            scene = new Scene(patientsOverview, 320, 240);  //Revoir la taille avec scene builder

            Stage mainWindow; //Here is the magic. We get the reference to main Stage.
            mainWindow = (Stage) Window.getWindows().get(0);
            mainWindow.setScene(scene); //here we simply set the new scene

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}