module com.ujjol.audio {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.ujjol.audio to javafx.fxml;
    exports com.ujjol.audio;
}