/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author mkamdom
 */
public class Clignote extends TypeEffect {

    public Clignote(String m, int del) {
        super(m, del);
    }

    @Override
    public void AfficherSur(Bandeau b) {
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        b.setMessage(message);
        b.sleep(del);
        b.setMessage("");
        b.sleep(del);
        b.setMessage(message);
        b.sleep(del);

    }

}
