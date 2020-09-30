/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import Strategy.*;
/**
 *
 * @author joao
 */
public class MododaAlimentacaoFactory {
    public MododaAlimentacao criarModoAlimentar(String fase){
        if(fase.equalsIgnoreCase("pintinho")){
            return new PrimeiraAlimentacao();
    }if(fase.equalsIgnoreCase("jovem")){
            return new SegundaAlimentacao();
    }if(fase.equalsIgnoreCase("adulto")){
            return new TerceiraAlimentacao();
    }else{
        return new SegundaAlimentacao();
    }
    
    
}
} 