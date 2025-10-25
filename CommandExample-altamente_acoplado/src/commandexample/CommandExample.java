package commandexample;

import domain.ControleRemoto;
import domain.Luz;

public class CommandExample {
    public static void main(String[] args) {
        Luz luz = new Luz();
        
        ControleRemoto controle = new ControleRemoto(luz);
        
        controle.apertarBotaoLigar();
        controle.apertarBotaoDesligar();
    }
}