/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mkone03
 */
public class Scenario {
    List<TypeEffect> ListeTypeDeffect = new  LinkedList<>();

    public Scenario() {
    }
    
    
    
    
    public void AddEffect(TypeEffect effect,int repetition){
        
        for (int i = 0; i < repetition; i++) {
            ListeTypeDeffect.add(effect);
        }
    }
    
    
    public void playOn(Bandeau b){
        ListeTypeDeffect.forEach(effect->{
            effect.AfficherSur(b);
        });
    }    
}
