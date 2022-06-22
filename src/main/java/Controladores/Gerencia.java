package Controladores;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Gerencia extends Application {
    protected static Stage estagioPrimario = null;
    protected static Stage dashboard = null;
    public static void main(String[] args) {
        launch (args);
    }
    
    @Override
    public void start(Stage palco) throws Exception {
        if (estagioPrimario == null) {
            palco.setScene(LoginControlador.realizarLogin());
            estagioPrimario = palco;
        }
        palco.getIcons().add(new Image("/Imagens/inseto.png"));            
        palco.show();
        
    }

    public static void chamaStart (Stage estado) throws Exception {
        Gerencia gerenciador = new Gerencia();
        gerenciador.start(estado);
    }
    protected static void alteraEstagioPrimario (Stage stage) {
        Gerencia.estagioPrimario = stage;
    }
    protected static Stage setScene (Scene cena) {
        Stage estadoPrincipal = new Stage();
        estadoPrincipal.setScene (cena);
        return estadoPrincipal;
    }
}
