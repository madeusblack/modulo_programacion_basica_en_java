
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
public class determinarmayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingrese la cantidad de cifras a verificar");
        Scanner lector=new Scanner(System.in);
        int cifras=lector.nextInt();
        int numeroMayor=0;
        for(int i=1;i<cifras;i++){
            System.out.println("ingrese un numero");
            int cifraActual=lector.nextInt();
            if(i==1||cifraActual>numeroMayor){numeroMayor=cifraActual;}            
        }
        System.out.println("la cifra mayor es " + numeroMayor);
        
    }
    
}
