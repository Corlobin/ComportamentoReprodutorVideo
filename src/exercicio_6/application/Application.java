/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_6.application;

import exercicio_6.cdp.AbstractFormatoReader;
import exercicio_6.cdp.FormatoAVI;

/**
 *
 * @author Ricardo
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFormatoReader ACulpaEDasEstrelas = new FormatoAVI();
        ACulpaEDasEstrelas.start("a culpa e das estrelas.avi", "a culpa e das estrelas.leg");
    }

}
