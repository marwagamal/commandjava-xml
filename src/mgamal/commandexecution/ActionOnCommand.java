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
public class ActionOnCommand {

    public String split(String[] args) {

        return args[1].substring(0, args[1].lastIndexOf(args[2]))
                + "\n"
                + args[1].substring(args[1].lastIndexOf(args[2]), args[1].length());

    }

    public String replace(String[] args) {

        return args[1].replace(args[2], args[3]);
    }

    public int find(String[] args) {

        return args[1].indexOf(args[2]);
    }

    public int add(String[] args) {

        String[] splitdata = args[1].split(" ");
        int result = 0;
        for (String num : splitdata) {
            result += Integer.parseInt(num);
        }
        return result;
    }
}
