


package singleton;

import java.util.Scanner;
/**
 * @author elio
 */
public class Singleton {

    public static void main(String[] args) {
        
        
        singleStone sin = singleStone.getSingleton(); 
        Scanner sc= new Scanner(System.in);
        
        System.out.println("ingrese nombre del creador del singleton");
        String nombre= sc.nextLine();
        
        singleStone.setNombre(nombre);
        System.out.println(sin.getNombre());
    }
    
}
