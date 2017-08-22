/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligence_in_production;

import views.JanelaPrincipal;

/**
 *
 * @author Ghost
 */

public class Inteligence_in_production {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaPrincipal window = new JanelaPrincipal();
        window.setExtendedState(window.getExtendedState() | window.MAXIMIZED_BOTH);
        window.setVisible(true);
    }
    
}
