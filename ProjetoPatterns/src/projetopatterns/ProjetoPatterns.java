/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopatterns;
import Factory.*;
/**
 *
 * @author joao
 */
public class ProjetoPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Granja g = new Granja();
        g.mudarTemperatura(20);
        g.veraTemperatura();
    }
    
}
