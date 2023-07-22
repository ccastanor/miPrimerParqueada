module com.edu.uniquindio.parqueadero {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.edu.uniquindio.parqueadero to javafx.fxml;
    exports com.edu.uniquindio.parqueadero;
}