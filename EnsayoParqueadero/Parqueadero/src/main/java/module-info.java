module com.edu.uniquindio.parqueadero {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.edu.uniquindio.Main to javafx.fxml;
    exports com.edu.uniquindio.Main;
    exports com.edu.uniquindio.Controllers;
    opens com.edu.uniquindio.Controllers to javafx.fxml;
}