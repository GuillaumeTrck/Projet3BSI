module com.projet3bsi.projet3bsi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.projet3bsi.projet3bsi to javafx.fxml;
    exports com.projet3bsi.projet3bsi;
}