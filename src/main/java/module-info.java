module com.maquinacoxinha {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.maquinacoxinha to javafx.fxml;
    exports com.maquinacoxinha;
}
