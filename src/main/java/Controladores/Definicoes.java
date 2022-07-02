package Controladores;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

final public class Definicoes {
    final public void chamaStart (Stage estado) throws Exception {
        Gerencia gerenciador = new Gerencia();
        gerenciador.start(estado);
    }
    final protected void alteraJanelaAtual (Stage stage) {
        Gerencia.janelaAtual = stage;
    }
    final protected Stage setScene (Scene cena) {
        Stage estadoPrincipal = new Stage();
        estadoPrincipal.setScene (cena);
        return estadoPrincipal;
    }
    final public void alteraIcon (Stage janela) {
        janela.getIcons().add(new Image("/Imagens/inseto.png"));
    }
    final public void fechaJanela () {
        Gerencia.janelaAtual.close();
    }
}
