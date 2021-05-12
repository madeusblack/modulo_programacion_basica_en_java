
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
public class promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese 4 notas");
        int cantidadDeNotas=4;
        int notas=0;
        for(int i=0;i<cantidadDeNotas;i++){
            System.out.println("ingrese una nota");
            Scanner lector=new Scanner(System.in);
            int nota=lector.nextInt();
            notas=notas+nota;
        }
        System.out.println(notas);
        float promedioNotas=notas/cantidadDeNotas;
        System.out.println("el promedio de notas es " + promedioNotas);
        // TODO code application logic here
    }
    
}
