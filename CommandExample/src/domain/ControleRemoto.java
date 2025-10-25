package domain;

import interfaces.Command;

public class ControleRemoto {
    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void apertarBotao() {
        this.command.execute();
    }
}
