module com.projet3bsi.projet3bsi {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter;
    requires org.junit.platform.launcher;
    requires org.junit.platform.commons;
    requires org.junit.platform.engine;


    opens com.projet3bsi.projet3bsi to javafx.fxml;
    exports com.projet3bsi.projet3bsi;
    opens com.projet3bsi.projet3bsi.Controlers to javafx.fxml;
    exports com.projet3bsi.projet3bsi.Controlers;
    opens com.projet3bsi.projet3bsi.Models to javafx.fxml;
    exports com.projet3bsi.projet3bsi.Models;

}


