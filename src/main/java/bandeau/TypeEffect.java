/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/** 
 *
 * @author mkone03
 */
public abstract  class TypeEffect {
    String message;
    int del;

    public TypeEffect(String m, int del) {
        message=m;
        this.del=del;
    }
    
    
    public abstract void AfficherSur(Bandeau b);
    
    
    
}
