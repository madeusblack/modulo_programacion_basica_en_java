/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madeus
 */
public class Cronometro {
    private int contador;
    public Cronometro(){
    this.contador=0;
    }
    public Cronometro(int contador){
        if(contador<=0){
        this.contador=contador;
        }else{
        this.contador=0;}
    }
    public int getContador(){
        return contador;
    }
    public void setContador(int contador){
        if(contador<=0){
        this.contador=contador;
        }else{
        this.contador=0;}
    }
    public void aumentarContador(){
        this.contador++;
    }
    public void disminuitContador(){
        this.contador--;
    }
}
