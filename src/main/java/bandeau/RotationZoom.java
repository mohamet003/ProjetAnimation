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
public class RotationZoom extends TypeEffect{
    
    String message;
    int del;
    
    
    public RotationZoom(String message,int del) {
        this.message = message;
        this.del=del;
    }
    
    public void PlayOn(Bandeau b,int del){
        
    }

    @Override
    public void AfficherSur(Bandeau b) {
        
            
            b.setMessage(message);
            for (int i = 0; i <= 100; i++) {
                b.setRotation(2*Math.PI*i / 100);
                b.setFont(new Font("Dialog", Font.BOLD, 5+i));
                b.sleep(del);
            }
    }
    
    
    
    
    
}
