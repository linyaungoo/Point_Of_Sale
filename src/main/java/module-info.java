module com.example.pos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.pos to javafx.fxml;
    exports com.example.pos;
}