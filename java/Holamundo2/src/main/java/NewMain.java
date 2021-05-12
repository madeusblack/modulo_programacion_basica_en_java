/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Madeus
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Hola Mundo");
        int num = 112;
        byte bit = 3;
        System.out.println(num);
        System.out.println(bit);
        num=num+bit;
        System.out.println(num);   
        while(num>105){
            System.out.println("una menos");
            num--;
        }
        for(int i=0;i<5;i++){
            System.out.println("esto es un For");
            if(i%2==0){
                System.out.println("es numero par la iteracion");
            }
        }
        
        //promedio de 4 notas
        
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
        
        
        
    }
    
}
