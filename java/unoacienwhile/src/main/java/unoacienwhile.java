
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
public class unoacienwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int acom = 0,acomAlt=0;
        Scanner lector=new Scanner(System.in);
        System.out.println("ingrese el numero maximo a evaluar");
        int limite=lector.nextInt();
        System.out.println("ingrese el multiplo por el cual revisar");
        int multiplo=lector.nextInt();
        System.out.println("ingrese un multiplo alternotivo por el cual revisar");
        int multiploalt=lector.nextInt();
        int i=0;
        while(i<limite){
            if(i%multiplo==0){
                acom=acom+i;
                System.out.println("la suma acutal es " + acom);
            }
            if(i%multiploalt==0)
            i++;
        }
        System.out.println("la suma total es " + acom);
        
    }
    
}
