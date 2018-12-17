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
public class RotationZoom extends TypeEffect {

    public RotationZoom(String m, int del) {
        super(m, del);
    }

    @Override
    public void AfficherSur(Bandeau b) {

        b.setMessage(message);
        for (int i = 0; i <= 100; i++) {
            b.setRotation(2 * Math.PI * i / 100);
            b.setFont(new Font("Dialog", Font.BOLD, 2 + i / 3));
            b.sleep(del);
        }
    }

}
