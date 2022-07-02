package Controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class EditarControlador {
    @FXML protected Button btBuscarId;
    @FXML protected Button btSalvarAlteracoes;
    @FXML protected TextField cxBuscarId;
    @FXML protected TextField cxCor;
    @FXML protected TextField cxEstado;
    @FXML protected TextField cxNomeCientifico;
    @FXML protected TextField cxNomePopular;
    @FXML protected TextField cxPais;
    @FXML protected TextField cxQtdeOlhos;
    @FXML protected TextField cxQtdePernas;
    @FXML protected TextField cxRetornoCientifico;
    @FXML protected Hyperlink lkCadastrar;
    @FXML protected Hyperlink lkConsultar;
    @FXML protected Hyperlink lkEditar;
    @FXML protected Hyperlink lkExcluir;
    @FXML protected Hyperlink lkSair;
    @FXML protected ToggleGroup perigoso;
    @FXML protected RadioButton rdNao;
    @FXML protected RadioButton rdSim;

    @FXML
    void cadInseto () throws Exception {
        TelaControlador Cadastrar = new TelaControlador();
        Cadastrar.cadInseto();
    }

    @FXML
    void conInseto() throws Exception {
        TelaControlador Consultar = new TelaControlador();
        Consultar.conInseto();
    }
/*
    @FXML
    void ediInseto() throws Exception {
        TelaControlador Editar = new TelaControlador();
        Editar.ediInseto();
    }
*/
    @FXML
    void excInseto() throws Exception {
        TelaControlador Excluir = new TelaControlador();
        Excluir.excInseto();
    }

    @FXML
    void menu () throws Exception {
        Gerencia.a.fechaJanela(); TelaControlador.abreMenu();
    }

    @FXML
    void desloga() throws Exception {
        TelaControlador sair = new TelaControlador();
        sair.desloga();
    }
}
