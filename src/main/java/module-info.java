module com.example.moviesproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.moviesproject to javafx.fxml;
    exports com.example.moviesproject;
}