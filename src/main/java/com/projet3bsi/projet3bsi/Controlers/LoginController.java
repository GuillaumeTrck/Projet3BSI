package com.projet3bsi.projet3bsi.Controlers;

import com.projet3bsi.projet3bsi.CareApplication;
import com.projet3bsi.projet3bsi.Models.Patients;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.util.HashSet;


public class LoginController {


    public static class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            Text scenetitle = new Text("Welcome");
            Label userName = new Label( "User Name:" );
            TextField userTextField = new TextField();
            Label pw = new Label("Password:");
            PasswordField pwBox = new PasswordField();
            Button btn = new Button( "Sign in" );

            VBox vb = new VBox();
            vb.getChildren().add(scenetitle);
            GridPane gp = new GridPane();
            gp.add(userName,0,0);
            gp.add(userTextField,1,0);
            gp.add(pw,0,1);
            gp.add(pwBox,1,1);
            vb.getChildren().add(gp);
            vb.getChildren().add(btn);

            scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
            vb.setSpacing(10);
            vb.setPadding(new Insets(10));
            gp.setHgap(10);
            gp.setVgap(10);




        }

    }

    public void OnButonClick(ActionEvent actionEvent) {
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
        mainWindow.setScene(scene); //here we simply set the new scene
    }

    private static String currentUnitCare;
    public void SetCurrentUnitCare(String unitCare){
        currentUnitCare = unitCare;
    }
}