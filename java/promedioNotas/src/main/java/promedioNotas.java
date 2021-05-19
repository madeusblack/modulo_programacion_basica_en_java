
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
public class promedioNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingrese la cantidad de notas que desea ingresar");
        Scanner lector=new Scanner(System.in);
        int cantidadNotas=lector.nextInt();
        int notasActuales=1;
        float acomNotas=0F;
        while(notasActuales<cantidadNotas+1){
            System.out.println("ingrese una nota");
            float notaActual=lector.nextFloat();
            acomNotas=acomNotas+notaActual;
            notasActuales++;
        }
        float promedio=acomNotas/cantidadNotas;
        System.out.println("el promedio es " + promedio);
    }
    
}
