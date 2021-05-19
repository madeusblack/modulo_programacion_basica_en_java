
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
public class calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner(System.in);
        System.out.println("ingrese 1 para suma 2 para resta 3 para multiplicacion y 4 para division");
        int operacion = lector.nextInt();
        int op1,op2,resultado;
        switch(operacion){
            case 1:
                System.out.println("ingrese primer numero a sumar");
                op1 = lector.nextInt();
                System.out.println("ingrese segundo numero a sumar");
                op2 = lector.nextInt();
                resultado=op1+op2;
                System.out.println("El resultado de la suma de ambos numeros es " + resultado);
                break;
            case 2:
                System.out.println("ingrese primer numero a sumar");
                op1 = lector.nextInt();
                System.out.println("ingrese segundo numero a sumar");
                op2 = lector.nextInt();
                resultado=op1+op2;
                System.out.println("El resultado de la suma de ambos numeros es " + resultado);
                break;
            case 3:
                System.out.println("ingrese primer numero a sumar");
                op1 = lector.nextInt();
                System.out.println("ingrese segundo numero a sumar");
                op2 = lector.nextInt();
                resultado=op1+op2;
                System.out.println("El resultado de la suma de ambos numeros es " + resultado);
                break;
            case 4:
                System.out.println("ingrese primer numero a sumar");
                op1 = lector.nextInt();
                System.out.println("ingrese segundo numero a sumar");
                op2 = lector.nextInt();
                resultado=op1+op2;
                System.out.println("El resultado de la suma de ambos numeros es " + resultado);
                break;
            default:
                break;
        }
    }
    
    
}
