/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author joao
 */
public class normal implements EstadoCrescimento{

    @Override
    public void crescimento() {
        System.out.println("O crescimento dos frangos está normal de acordo com o esperado");
    }
    
}
