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
public class Lentofrio implements EstadoCrescimento {

    @Override
    public void crescimento() {
        System.out.println("O crescimento está prejudicado pois o clima está muito frio");
    }
    
}
