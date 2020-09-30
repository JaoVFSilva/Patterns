/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author joao
 */
public class SegundaAlimentacao implements MododaAlimentacao {

    @Override
    public void ModoAlimentação() {
        System.out.println("Após um dia de vida, passe a alimentá-los regularmente com ração inicial. Geralmente elas contêm 20% de proteína e devem ser fornecidas aos pintinhos até oito semanas de idade");
    }
    
}
