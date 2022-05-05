module mx.unam.clavesuiscene {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens mx.unam.clavesuiscene to javafx.fxml;
    exports mx.unam.clavesuiscene;
}