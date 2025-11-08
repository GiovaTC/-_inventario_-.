module com.inventario.inventario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.inventario.inventario to javafx.fxml;
    exports com.inventario.inventario.ui;
    opens com.inventario.inventario.ui to javafx.fxml;
    exports com.inventario.inventario.model;
    opens com.inventario.inventario.model to javafx.fxml;
    exports com.inventario.inventario.db;
    opens com.inventario.inventario.db to javafx.fxml;
}