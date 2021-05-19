
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
public class vinicultores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println("ingrese el tipo de uva");
            Scanner lector=new Scanner(System.in);
            String tipoUva=lector.next();
            System.out.println("ingrese el tamaño de uva");
            int tamañoUva=lector.nextInt();
            int precioFinal=0;
            if(tipoUva=="a"||tipoUva=="A"){
                if(tamañoUva==1){
                precioFinal=precioFinal+20;
                }else{
                    precioFinal=precioFinal+30;
                }
            }else{
                if(tamañoUva==1){
                    precioFinal=precioFinal-30;
                }else{
                    precioFinal=precioFinal-50;

                }
            }
            System.out.println("ingrese total de kgs");
            int totalKgs=lector.nextInt();
            System.out.println("el total de ganancia/perdida es"+(totalKgs*precioFinal));                
    }
    
}
