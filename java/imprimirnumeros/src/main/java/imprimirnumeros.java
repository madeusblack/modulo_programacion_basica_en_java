
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
public class imprimirnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingrese la cantidad de numeros que desea imprimir");
        Scanner lector=new Scanner(System.in);
        int cantidadnum=lector.nextInt();
        int numerosActuales=1;
        while(numerosActuales<cantidadnum+1){
            System.out.println(numerosActuales);
            numerosActuales=numerosActuales+3;
        }

    }
    
}
