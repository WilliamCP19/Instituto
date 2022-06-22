package Controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TelaControlador {
    @FXML protected Label cxID;
    @FXML protected Label lbNomeCientifico;
    @FXML protected Label lbNomePopular;
    @FXML protected Label lbNomeUsuario;
    @FXML protected Hyperlink lkCadastrar;
    @FXML protected Hyperlink lkConsultar;
    @FXML protected Hyperlink lkEditar;
    @FXML protected Hyperlink lkExcluir;
    @FXML protected Hyperlink lkSair;
    int cont = 0;
    @FXML
    void cadInseto () throws Exception {
        Parent cadastrar = FXMLLoader.load(getClass().getResource("../Janelas/Cadastrar-Inseto.fxml"));
        Scene telaCadIns = new Scene(cadastrar);
        Stage cadastrarInseto = Gerencia.setScene(telaCadIns);
        Gerencia.chamaStart(cadastrarInseto); Gerencia.alteraEstagioPrimario(cadastrarInseto); cont++;
    }

    @FXML
    void conInseto () throws Exception {
        Parent consultar = FXMLLoader.load (getClass().getResource("../Janelas/Consultar-Inseto.fxml"));
        Scene telaConsultar = new Scene(consultar);
        Stage consultarInseto = Gerencia.setScene(telaConsultar);
        Gerencia.chamaStart(consultarInseto); Gerencia.alteraEstagioPrimario(consultarInseto); cont++;
    }

    @FXML
    void ediInseto () throws Exception {
        Parent editar = FXMLLoader.load (getClass().getResource("../Janelas/Editar-Inseto.fxml"));
        Scene telaEditar = new Scene(editar);
        Stage editarInseto = Gerencia.setScene(telaEditar);
        Gerencia.chamaStart(editarInseto); Gerencia.alteraEstagioPrimario(editarInseto); cont++;
    }

    @FXML
    void excInseto () throws Exception {
        Parent excluir = FXMLLoader.load (getClass().getResource("../Janelas/Excluir-Inseto.fxml"));
        Scene telaExcluir = new Scene(excluir);
        Stage excluirInseto = Gerencia.setScene(telaExcluir);
        Gerencia.chamaStart(excluirInseto); Gerencia.alteraEstagioPrimario(excluirInseto); cont++;
    }


    public void chamaLogin () throws Exception {
        Gerencia.dashboard.close();
        Gerencia.dashboard = null;
        Gerencia.chamaStart(new Stage());
    }
    @FXML
    void desloga() throws Exception {
        Gerencia.estagioPrimario.close();
        Gerencia.estagioPrimario = null; cont--;
        if (cont == 0) {
            chamaLogin();
        }
    }
}
