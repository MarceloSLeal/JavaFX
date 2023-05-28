package br.com.marcelo.javafx.fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginControlador {

    @FXML
    private TextField campoEmail;

    @FXML
    private PasswordField campoSenha;

    public void entrar() {
        boolean emailValido = campoEmail.getText().equals("email@email.com");
        boolean senhaValida = campoSenha.getText().equals("1234");

        if (emailValido && senhaValida) {
            Notifications.create()
                    .position(Pos.CENTER)
                    .title("Login FXML")
                    .text("Login efetuado com sucesso")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.CENTER)
                    .title("Login FXML")
                    .text("Usuário e senha inválidos")
                    .showError();
        }

    }

}
