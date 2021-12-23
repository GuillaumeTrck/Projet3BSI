module com.projet3bsi.projet3bsi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.projet3bsi.projet3bsi to javafx.fxml;
    exports com.projet3bsi.projet3bsi;
    exports com.projet3bsi.projet3bsi.Controlers;
    opens com.projet3bsi.projet3bsi.Controlers to javafx.fxml;
    exports com.projet3bsi.projet3bsi.Models;
    opens com.projet3bsi.projet3bsi.Models to javafx.fxml;
}