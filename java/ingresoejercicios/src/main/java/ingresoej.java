
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
public class ingresoej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingrese la cantidad de cifras que desea ingresar");
        Scanner lector=new Scanner(System.in);
        int cantidadCifras=lector.nextInt();
        int contadorPares=0, contadorImpares=0,sumaPares=0,sumaImpares=0;
        for(int i=1;i<cantidadCifras;i++){
        System.out.println("Ingrese un numero");
        int numeroActual=lector.nextInt();
        if(numeroActual%2==0){
            contadorPares++;
            sumaPares=numeroActual+sumaPares;
        }else{
            contadorImpares++;
            sumaImpares=numeroActual+sumaImpares;
        }
        
        }

        if(contadorPares<contadorImpares){
            System.out.println("se ingresaron mas numeros pares que impares");
        }else{
            System.out.println("se ingresaron mas numeros impares que pares");

        }

        System.out.println("la suma de pares es " + sumaPares);
        System.out.println("la suma de impares es " + sumaImpares);
        System.out.println("se ingresaron " + contadorPares + "numeros pares");
        System.out.println("se ingresaron " + contadorImpares + "numeros impares");
        }
    }
    
