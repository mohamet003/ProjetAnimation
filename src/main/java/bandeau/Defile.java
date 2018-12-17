/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author mkamdom
 */
public class Defile extends TypeEffect {

    public Defile(String m, int del) {
        super(m, del);
    }

    @Override
    public void AfficherSur(Bandeau b) {
        b.setMessage(message);
        for (int i = 0; i < 50; i++) {
            message = " " + message;
            b.setMessage(message);
            b.sleep(del);
        }
    }

}
