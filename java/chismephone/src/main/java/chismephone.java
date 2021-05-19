
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
public class chismephone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingrese cantidad de minutos hablados");
        Scanner lector=new Scanner(System.in);
        int cantidadMin=lector.nextInt();
        float valorFinal,costoMinutos=0F;
        if(cantidadMin<=5){costoMinutos=cantidadMin*100;}
        if(cantidadMin>5&&cantidadMin<=8){costoMinutos=((cantidadMin-5)*80)+500;}
        if(cantidadMin>8&&cantidadMin<=10){costoMinutos=((cantidadMin-8)*70)+740;}
        if(cantidadMin>10){costoMinutos=((cantidadMin-10)*50)+880;}
        System.out.println("ingrese el dia de la semana en el que se realizo la llamada");
        String dia=lector.next();
        
        if(dia=="Domingo"){
            valorFinal=costoMinutos*1.03F;
        }
        if(dia=="Sabado"){
            valorFinal=costoMinutos;
        }else{
            System.out.println("¿La llamada fue en horario diurno o vespertino?");
            String horario=lector.next();
            if(horario=="diurno"){
                valorFinal=costoMinutos*1.15F;

            }else{
                valorFinal=costoMinutos*1.10F;

            }

        }
        System.out.println("el costo de la llamada es " + valorFinal);



    }
    
}
