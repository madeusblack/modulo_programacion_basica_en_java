/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madeus
 */


    /**
     * @param args the command line arguments
     */
        
    public class clases {

    public static void main(String[] args) {
        // TODO code application logic here
        Gpu gpu = new Gpu();
        Personaje huTao = new Personaje("Hu Tao","Calma de los espiritus","Guia del mas alla","pyro","dps");
        huTao.mostrarPersonaje();
        System.out.println(huTao.getDañoBase());
        System.out.println(huTao.nombrePersonaje);
    }
    
}
