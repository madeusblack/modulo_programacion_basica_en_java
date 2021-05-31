
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
public class triplearreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner(System.in);
        System.out.println("ingrese tamaño de arreglos");
                int tamanoArreglo=lector.nextInt();
                int total=0;
                int array[] =new int[tamanoArreglo];
                int array1[] =new int[tamanoArreglo];
                int arraySuma[] =new int[tamanoArreglo];
                System.out.println("ingrese cifras primer arreglo");
                for(int i=0;i<tamanoArreglo;i++){
                array[i]=lector.nextInt();
                }
                System.out.println("ingrese cifras segundo arreglo");

                for(int i=0;i<tamanoArreglo;i++){
                array1[i]=lector.nextInt();
                }
                for(int i=0;i<tamanoArreglo;i++){
                arraySuma[i]=array[i]+array1[i];
                }
                for(int i=0;i<tamanoArreglo;i++){
                    System.out.println("suma "+arraySuma[i]);
                    
                }
    }
    
}
