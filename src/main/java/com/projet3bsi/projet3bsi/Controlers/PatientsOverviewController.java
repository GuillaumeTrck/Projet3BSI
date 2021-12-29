package com.projet3bsi.projet3bsi.Controlers;

import com.projet3bsi.projet3bsi.CareApplication;
import com.projet3bsi.projet3bsi.Models.Patients;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class PatientsOverviewController {
        @FXML
        private TableView<Patients> patientsTable;
        @FXML
        private TableColumn<Patients, String> firstNameColumn;
        @FXML
        private TableColumn<Patients, String> lastNameColumn;

        @FXML
        private Label firstNameLabel;
        @FXML
        private Label lastNameLabel;
        @FXML
        private Label streetLabel;
        @FXML
        private Label postalCodeLabel;
        @FXML
        private Label cityLabel;
        @FXML
        private Label birthdayLabel;
/*
        private CareApplication careApplication;

        public PatientsOverviewController() {
        }

        @FXML
        private void initialize() {
            firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
            lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        }



        public void setCareApplication(CareApplication careApplication) {
            this.careApplication = careApplication;

            patientsTable.setItems(careApplication.getPatientsData());
        }

 */





        public void OnBtnReturnClick(ActionEvent actionEvent) {

                FXMLLoader fxmlUnitPeople = new FXMLLoader(CareApplication.class.getResource("unit-people-view.fxml"));

                Scene scene = null;
                try {
                        scene = new Scene(fxmlUnitPeople.load(), 320, 240);
                } catch (IOException e) {
                        e.printStackTrace();
                }


                Stage mainWindow; //Here is the magic. We get the reference to main Stage.
                mainWindow = (Stage) Window.getWindows().get(0);
                mainWindow.setScene(scene); //here we simply set the new scene

        }

}
