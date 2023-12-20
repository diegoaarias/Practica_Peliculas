module com.example.practicapeliculas {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires org.json;

    opens com.example.practicapeliculas to javafx.fxml;
    opens com.example.practicapeliculas.model to javafx.base;
    exports com.example.practicapeliculas;
}