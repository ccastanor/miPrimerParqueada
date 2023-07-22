module com.edu.uniquindio.parquedero.parqueadero {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
                requires com.almasb.fxgl.all;
    
    opens com.edu.uniquindio.parquedero.parqueadero to javafx.fxml;
    exports com.edu.uniquindio.parquedero.parqueadero;
}