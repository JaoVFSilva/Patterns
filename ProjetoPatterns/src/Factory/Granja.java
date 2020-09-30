/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Observer.*;
import State.*;
import Strategy.*;


/**
 *
 * @author joao
 */
public class Granja {
    MododaAlimentacao modo;
    EstadoCrescimento estadoC;
    
    Termometro t = new Termometro();

    
    public void mudarTemperatura(float temperatura){
        t.setTemperatura(temperatura);
    }
    
    public void veraTemperatura(){
        t.getTemperatura();
    }
    
    
    
    
    
    
    
}
