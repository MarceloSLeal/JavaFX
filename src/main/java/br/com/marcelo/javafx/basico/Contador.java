package br.com.marcelo.javafx.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicReference;

public class Contador extends Application {

    private int contador = 0;

    @Override
    public void start(Stage stage) throws Exception {

        Label labelTitulo = new Label("Contador");
        Label labelNumero = new Label(String.valueOf(contador));

        Button botaoDecremento = new Button("-");
        botaoDecremento.setOnAction(e -> {
            contador--;
            labelNumero.setText(Integer.toString(contador));
        });

        Button botaoIncremento = new Button("+");
        botaoIncremento.setOnAction(e -> {
            contador++;
            labelNumero.setText(Integer.toString(contador));
        });

        
        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);


        VBox boxPrincipal = new VBox();
        boxPrincipal.setSpacing(10);
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.getChildren().add(labelTitulo);
        boxPrincipal.getChildren().add(labelNumero);
        boxPrincipal.getChildren().add(boxBotoes);

        Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400);

        stage.setScene(cenaPrincipal);
        stage.show();

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}
