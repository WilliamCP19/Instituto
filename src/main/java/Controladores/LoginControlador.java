package Controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginControlador {
    @FXML protected Button btEntrar;
    @FXML protected PasswordField cxSenha;
    @FXML protected TextField cxUsuario;
    @FXML protected Hyperlink lkCadastre;
    @FXML protected Hyperlink lkRedefinir;
    @FXML protected RadioButton rdAutenticacao;

    @FXML
    protected static Scene realizarLogin () throws Exception {
        Parent login = FXMLLoader.load(LoginControlador.class.getResource("../Janelas/Login.fxml"));
        Scene telaLogin = new Scene (login);   
        return telaLogin;
    }

    @FXML
    void autenticacao () throws Exception {
        if (cxUsuario.getText().equals("") && cxSenha.getText().equals("")) {
            Parent entrar = FXMLLoader.load(getClass().getResource("../Janelas/Tela-Principal.fxml"));
            Scene telaPrincipal = new Scene (entrar); Gerencia.a.fechaJanela();
            Stage acessSistema = Gerencia.a.setScene(telaPrincipal);
            TelaControlador.evitaRepetir(acessSistema); TelaControlador.dashboard = Gerencia.janelaAtual;
        } else {
            Alert erroAutenticacao = new Alert (AlertType.ERROR);
            erroAutenticacao.setTitle("ERRO");
            erroAutenticacao.setHeaderText("Login Inválido");
            erroAutenticacao.setContentText("Essas credenciais não estão cadastradas no nosso sistema");
            erroAutenticacao.show();
        }
    }

    @FXML
    void redefinirSenha () throws Exception {
        Parent redefinir = FXMLLoader.load(getClass().getResource("../Janelas/Redefinir-Senha.fxml"));
        Scene telaRedefinir = new Scene (redefinir);
        Gerencia.a.chamaStart(Gerencia.a.setScene(telaRedefinir));
    }

    @FXML
    void cadEspecialista () throws Exception {
        Parent cadEsp = FXMLLoader.load(getClass().getResource("../Janelas/Cadastrar-especialista.fxml"));
        Scene telaCadEsp = new Scene (cadEsp);
        Gerencia.a.chamaStart(Gerencia.a.setScene(telaCadEsp));
    } 
}
