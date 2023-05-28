package br.com.marcelo.javafx.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        String arquivoCSS = getClass().getResource("/br/com/marcelo/javafx/fxml/Login.css").toExternalForm();
        FXMLLoader fxmlLoader = new FXMLLoader(AppFXML.class.getResource("login.fxml"));
        GridPane raiz = FXMLLoader.load(fxmlLoader.getLocation());

        Scene cena = new Scene(raiz, 350, 350);
        cena.getStylesheets().add(arquivoCSS);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Tela de Login");
        primaryStage.setScene(cena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
