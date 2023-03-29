module com.example.proyectopoofinal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.proyectopoofinal to javafx.fxml;
    exports com.example.proyectopoofinal;
}