
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
public class arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner lector=new Scanner(System.in);
                int tamanoArreglo=lector.nextInt();
                int total=0;
                int array[] =new int[tamanoArreglo];
                for(int i=0;i<tamanoArreglo;i++){
                array[i]=lector.nextInt();
                }
                for(int i=0;i<tamanoArreglo;i++){
                    System.out.println(array[i]);
                    total=total+array[i];
                    
                }
                System.out.println("la suma total es " + total);
    }
    
}
