package Controladores;

import javafx.application.Application;
import javafx.stage.Stage;
public class Gerencia extends Application {
    protected static Stage janelaAtual = null;
    final protected static Definicoes a = new Definicoes();
    
    public static void main(String[] args) {
        launch (args);
    }
    
    @Override
    public void start(Stage palco) throws Exception {
        if (janelaAtual == null) {
            palco.setScene(LoginControlador.realizarLogin());
            janelaAtual = palco; 
        }
        a.alteraIcon(palco);
        palco.show();
    }
}
