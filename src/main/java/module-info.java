module br.com.marcelo.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens br.com.marcelo.javafx to javafx.fxml;
    exports br.com.marcelo.javafx;


    ////////////

    opens br.com.marcelo.javafx.basico;
    opens br.com.marcelo.javafx.layout;
    opens br.com.marcelo.javafx.fxml;
}