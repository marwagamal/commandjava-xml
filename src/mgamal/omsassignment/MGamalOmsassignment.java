/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgamal.omsassignment;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import mgamal.commandexecution.Action;
import mgamal.commandexecution.ActionFactoryOnCommand;
import mgamal.commandexecution.ActionOnCommand;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author marwagamal
 */
public class MGamalOmsassignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // read xml file 
        try {
            String[] param = new String[4];
            File xmlfile = new File("data/note.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlfile);

            doc.getDocumentElement().normalize();
            NodeList commandlist = doc.getElementsByTagName("command");

            if (commandlist != null && commandlist.getLength() > 0) {
                for (int i = 0; i < commandlist.getLength(); i++) {
                    if (commandlist.item(i).getNodeType() == Node.ELEMENT_NODE) {
                        Element command = (Element) commandlist.item(i);
                        param[0] = command.getAttribute("action");
                        param[1] = command.getElementsByTagName("data").item(0).getTextContent();
                        param[2] = command.getAttribute("paramx");
                        param[3] = command.getAttribute("paramy");
                    }
                    Action action = new Action();
                    ActionOnCommand mm = new ActionOnCommand();
                    ActionFactoryOnCommand splitaction = new ActionFactoryOnCommand(mm, param);

                    action.setCommand(splitaction);
                    action.doAction();

                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
