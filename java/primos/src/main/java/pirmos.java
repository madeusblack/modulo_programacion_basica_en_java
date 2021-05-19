
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
public class pirmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de numeros a revisar");
        int cifras=lector.nextInt();
        int i = 0;
        int multActual = 1;
        while (i<cifras){
        System.out.println("ingrese el numero a evaluar");
        int numeroARevisar=lector.nextInt();
        if(numeroARevisar%2!=0&&numeroARevisar%3!=0&&numeroARevisar%5!=0&&numeroARevisar%7!=0&&numeroARevisar%11!=0||numeroARevisar==2||numeroARevisar==3||numeroARevisar==5||numeroARevisar==7||numeroARevisar==11){
            multActual=multActual*numeroARevisar;
        }
        i++;
        }
        System.out.println("la multiplicacion de todos los numeros primos ingresados es " + multActual);
        }
        
    }
    

