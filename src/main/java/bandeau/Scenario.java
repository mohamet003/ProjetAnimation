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

    List<TypeEffect> ListeTypeDeffect = new LinkedList<>();
    List<Integer> listRepet = new LinkedList<>();

    public Scenario() {
    }

    public void AddEffect(TypeEffect effect, int repetition) {

        ListeTypeDeffect.add(effect);
        listRepet.add(repetition);

    }

    public void playOn(Bandeau b) {
        ListeTypeDeffect.forEach(effect -> {
            for (int i = 0; i < listRepet.get(ListeTypeDeffect.indexOf(effect)); i++) {
                effect.AfficherSur(b);
                
            }

        });
    }
}
