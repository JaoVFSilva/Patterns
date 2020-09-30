/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao
 */
public class Termometro {
   
    private float temperatura = 0;
    private float temperaturaAnterior = 0;

    public float getTemperaturaAnterior() {
        return temperaturaAnterior;
    }

    public void setTemperaturaAnterior(float temperaturaAnterior) {
        this.temperaturaAnterior = temperaturaAnterior;
        
    }

    
    
    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperaturaAnterior = this.temperatura;
        this.temperatura = temperatura;
    }

      
    
}
