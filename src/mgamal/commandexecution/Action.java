/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgamal.commandexecution;

/**
 *
 * @author marwagamal
 */
public class Action {

    private Command command;

    public void setCommand(Command command) {

        this.command = command;

    }

    public void doAction() {

        command.execute();

    }
}
