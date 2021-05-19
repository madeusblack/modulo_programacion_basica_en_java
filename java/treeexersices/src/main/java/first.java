
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
public class first {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //mostrar el mayor, el menor y el promedio de n cifras ingresadas 
     //ingresar n cifras hasta una clave de salida y luego mostrar la suma de estas
     //invertir una cifra de 4 numeros ingresada
        System.out.println("ingrese la cantidad de cifras a ingresar");
        Scanner lector=new Scanner(System.in);
        int cifras=lector.nextInt();
        int sumaProm = 0,menor=0,mayor=0,promedio;
        for(int i = 0; i<cifras;i++){
                System.out.println("ingrese un numero");
                int numeroActual=lector.nextInt();
                if(i==0){
                    menor=numeroActual;
                    mayor=numeroActual;
                }
                if(i>0&&mayor<numeroActual){mayor=numeroActual;}
                if(i>0&&menor>numeroActual){menor=numeroActual;}
                sumaProm=numeroActual+sumaProm;
        }
        promedio=sumaProm/cifras;
        System.out.println("el promedio es " + promedio);
        System.out.println("el numero mayor es " + mayor);
        System.out.println("el numero menor es " + menor);
    }
    
}
