package com.projet3bsi.projet3bsi.Controlers;

import com.projet3bsi.projet3bsi.CareApplication;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.io.IOException;

public class LoginController {
    static String pwdFieldR = "20";
    static String userFieldR = "une note sur 20";
    @FXML
    private TextField userField;
    @FXML
    private PasswordField pwdField;


    public void BtnReturnClick(ActionEvent actionEvent) {
        FXMLLoader fxmlUnitPeople = new FXMLLoader(CareApplication.class.getResource("unit-view.fxml"));

        Scene scene = null;
        try {
            scene = new Scene(fxmlUnitPeople.load(), 320, 240);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage mainWindow; //Here is the magic. We get the reference to main Stage.
        mainWindow = (Stage) Window.getWindows().get(0);
        mainWindow.setTitle("Units");
        mainWindow.setScene(scene); //here we simply set the new scene
    }


    public static class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            FXMLLoader fxmlLoginController = new FXMLLoader(CareApplication.class.getResource("login.fxml"));
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(fxmlLoginController.load(),300,275));
            primaryStage.show();


        }

    }

    public void OnButonClick(ActionEvent actionEvent) {
        if(userField.getText().equals(userFieldR) && pwdField.getText().equals(pwdFieldR)){
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
            unitPatientsController.setListView(currentUnitCare);

            Stage mainWindow; //Here is the magic. We get the reference to main Stage.
            mainWindow = (Stage) Window.getWindows().get(0);
            mainWindow.setTitle("Patient");
            mainWindow.setScene(scene); //here we simply set the new scene
        }
        else {
            System.out.println("Identifiant ou mot de passe incorrect !");
        }
    }

    private static String currentUnitCare;
    public void SetCurrentUnitCare(String unitCare){
        currentUnitCare = unitCare;
    }
}
