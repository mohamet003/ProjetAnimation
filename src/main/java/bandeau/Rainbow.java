/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author mkone03
 */
public class Rainbow extends TypeEffect{
    
    
    String message;
    int del;
    
    
    public Rainbow(String message,int del) {
        this.message = message;
        this.del=del;
    }
   
      

    @Override
    public void AfficherSur(Bandeau b) {
        
        b.setMessage(message);
        b.setForeground(Color.WHITE);
        b.sleep(del);
        b.setBackground(Color.GREEN);
        b.sleep(del);
        b.setBackground(Color.YELLOW);
        b.sleep(del);
        b.setBackground(Color.RED);
        b.sleep(del);
        b.setBackground(Color.BLUE);
        b.sleep(del);
        b.setBackground(Color.WHITE);
        b.sleep(del);
        b.setBackground(Color.RED);
        b.sleep(del);
    }


}
