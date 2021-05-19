
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madeus
 */
public class langostaahumada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*costo platillo por persona 9500
        mayor a 200 y menor que 300 8500
        mas de 300 7500 */
            System.out.println("ingrese la cantidad de personsas");
            Scanner lector=new Scanner(System.in);
            int personas=lector.nextInt();
            int costoPlatillo=9500;
            if(personas>200&&personas<300){
                costoPlatillo=8500;
            }
            if(personas>300){
                costoPlatillo=7500;
            }
            System.out.println("el costo por persona esl " + costoPlatillo);
            System.out.println("el costo total es  " + (costoPlatillo*personas));
    }
    
}
