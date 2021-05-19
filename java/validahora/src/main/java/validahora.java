
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
public class validahora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner lector=new Scanner(System.in);
            boolean horaValida=true;
            System.out.println("ingrese una hora para validar");
            System.out.println("ingrese horas");
            int hora=lector.nextInt();
            System.out.println("ingrese minutos");
            int minutos=lector.nextInt();
            System.out.println("ingrese segundos");
            int segundos=lector.nextInt();
            if(hora<1||hora>24){horaValida=false;}
            if(minutos<0||minutos>59){horaValida=false;}
            if(segundos<0||segundos>59){horaValida=false;}
            if(horaValida){
                System.out.println("es una hora valida");
            }else{
                System.out.println("no es una hora valida");
            }

    }
    
}
