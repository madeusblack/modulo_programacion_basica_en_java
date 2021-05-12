
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
public class ilelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingrese un numero");
        Scanner lector=new Scanner(System.in);
        int numero=lector.nextInt();
        if(numero%2==0){
            System.out.println("el numero ingresado es par ");
        }else{
            System.out.println("el numero ingresado es impar ");

        }
    }
    
}
