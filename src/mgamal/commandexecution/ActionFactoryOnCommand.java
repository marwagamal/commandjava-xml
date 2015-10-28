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
public class ActionFactoryOnCommand implements Command {

    ActionOnCommand action;
    String[] args;

// 
    public ActionFactoryOnCommand(ActionOnCommand action, String[] args) {
        this.action = action;
        this.args = args;

    }

    public void execute() {

        switch (args[0]) {
            case "split":
                System.out.print(new ActionOnCommand().split(args));
                System.out.print("\n\n");
                break;
            case "replace":
                System.out.print(new ActionOnCommand().replace(args));
                System.out.print("\n\n");
                break;
            case "find":
                System.out.print(new ActionOnCommand().find(args));
                System.out.print("\n\n");
                break;
            case "add":
                System.out.print(new ActionOnCommand().add(args));
                System.out.print("\n\n");
                break;
            default:
                System.out.print("");
                break;

        }
    }

}
