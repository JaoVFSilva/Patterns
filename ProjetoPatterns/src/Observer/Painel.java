/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;


/**
 *
 * @author joao
 */
public class Painel implements Observador{
    @Override
    public void notificar(Termometro termometro){
        
        System.out.println("Notif painel");
        if (termometro.getTemperatura() > 25) {
            System.out.println("A temperatura foi de "+termometro.getTemperaturaAnterior()+" para "+termometro.getTemperatura()+"Inicie o resfriamento urgentemente");
        } else if(termometro.getTemperatura() < 17){
            System.out.println("A temperatura foi de "+termometro.getTemperaturaAnterior()+" para "+termometro.getTemperatura()+"Inicie o aquecimento urgente");
        }else{
            System.out.println("Nada ocorreu");
        }
    }
}
