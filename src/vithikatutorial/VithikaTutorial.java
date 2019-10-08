/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vithikatutorial;

import javax.swing.JApplet;
import javax.swing.UIManager;

/**
 *
 * @author Krushn Dayshmookh
 */
public class VithikaTutorial extends JApplet {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }

        ContactsWindow frame = new ContactsWindow();
        frame.setVisible(true);
    }

}
