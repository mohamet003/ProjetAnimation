/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;
import java.math.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author racin
 */
public class JeuxDuPendu extends TypeEffect {

    String machaine = "";

    public JeuxDuPendu(String m, int del) {
        super(m, del);
    }

    public List<Integer> randomMessage(String c) {

        List<Integer> tab = new LinkedList<>();
        Random r = new Random();
        while (tab.size() != c.length()) {
            int result = r.nextInt(c.length());
            //System.out.println("resl "+result+"  "+tab.contains(result)+" "+tab+" "+c.length());

            if (!tab.contains(result)) {
                tab.add(result);
                machaine += "_";
            }
        }
        return tab;
    }

    @Override
    public void AfficherSur(Bandeau b) {

        List<Integer> li = randomMessage(message);
        StringBuilder myName = new StringBuilder(machaine);

        for (Integer integer : li) {

            myName.setCharAt(integer, message.charAt(integer));
            b.setMessage(myName.toString());

            b.sleep(del);
        }

        /*
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
         */
    }

}
