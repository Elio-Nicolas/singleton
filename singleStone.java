/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author usuario
 */
public class singleStone {
    
    
     static private singleStone singleton = null;
     static private String nombre;
     
     private singleStone() {}
 
     static public singleStone getSingleton() {
 
         if (singleton == null) {
             singleton = new singleStone();
         }
         return singleton;
     }
 
    static public void setNombre(String nom){
    
         nombre=nom;
}
    
    public String getNombre(){
        
        return " "+ nombre +" realizo un patron";
    }
}
