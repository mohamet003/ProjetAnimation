/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

/**
 *
 * @author mkone03
 */
public class LettreOneByOne extends TypeEffect {

    public LettreOneByOne(String m, int del) {
        super(m, del);
    }

    @Override
    public void AfficherSur(Bandeau b) {

        String sous_chaine = "";
        for (int i = 0; i <= message.length() - 1; i++) {

            sous_chaine += message.substring(i, i + 1);
            int a = (int) message.substring(i, i + 1).charAt(0);
            if (a != 32) {
                for (int j = 3; j < 30; j++) {
                    b.setFont(new Font("Dialog", Font.BOLD, 20 + j));
                    b.setMessage(sous_chaine);
                    b.sleep((int) (del * 0.10));
                }
                b.sleep(del);
            } else {
                b.setMessage(sous_chaine);
            }
        }
    }

}
