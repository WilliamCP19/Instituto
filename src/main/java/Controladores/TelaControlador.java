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
    protected static Stage dashboard;

    @FXML
    void cadInseto () throws Exception {
        Parent cadastrar = FXMLLoader.load(getClass().getResource("../Janelas/Cadastrar-Inseto.fxml"));
        Scene telaCadIns = new Scene(cadastrar); Gerencia.a.fechaJanela();
        Stage cadastrarInseto = Gerencia.a.setScene(telaCadIns); evitaRepetir(cadastrarInseto);
    }

    @FXML
    void conInseto () throws Exception {
        Parent consultar = FXMLLoader.load (getClass().getResource("../Janelas/Consultar-Inseto.fxml"));
        Scene telaConsultar = new Scene(consultar); Gerencia.a.fechaJanela();
        Stage consultarInseto = Gerencia.a.setScene(telaConsultar); evitaRepetir(consultarInseto);
    }

    @FXML
    void ediInseto () throws Exception {
        Parent editar = FXMLLoader.load (getClass().getResource("../Janelas/Editar-Inseto.fxml"));
        Scene telaEditar = new Scene(editar); Gerencia.a.fechaJanela();
        Stage editarInseto = Gerencia.a.setScene(telaEditar); evitaRepetir(editarInseto);
    }

    @FXML
    void excInseto () throws Exception {
        Parent excluir = FXMLLoader.load (getClass().getResource("../Janelas/Excluir-Inseto.fxml"));
        Scene telaExcluir = new Scene(excluir); Gerencia.a.fechaJanela();
        Stage excluirInseto = Gerencia.a.setScene(telaExcluir); evitaRepetir(excluirInseto);
    }

    @FXML
    static void abreMenu () throws Exception {
        Gerencia.a.chamaStart(dashboard); Gerencia.a.alteraJanelaAtual(dashboard);
    }

    protected static void evitaRepetir (Stage funcao) throws Exception {
        Gerencia.a.chamaStart(funcao); 
        Gerencia.a.alteraJanelaAtual(funcao);
    }

    @FXML
    void desloga () throws Exception {
        Gerencia.a.fechaJanela(); Gerencia.janelaAtual = null;
        Gerencia.a.chamaStart(new Stage());
    }
}