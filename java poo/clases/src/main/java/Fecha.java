/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madeus
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    public Fecha(){
    this.dia=1;
    this.mes=1;
    this.año=2000;   
    }
    public Fecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
        if(!fechaCorrecta()){
            this.dia=1;
            this.mes=1;
            this.año=2000; 
        }
        
    }
    public void setDia(int dia){
        this.dia=dia;   
        if(!fechaCorrecta()){
        this.dia=1;
        }
    }
    public void setMes(int mes){
        this.mes=mes; 
        if(!fechaCorrecta()){
        this.mes=1;
        }
    }
    public void setAño(int año){
        this.año=año;
        if(!fechaCorrecta()){
        this.año=2000;
        }
    }
    public int getDia(){
        return this.dia;   
    }
    public int getMes(){
        return this.mes;   
    }
    public int getAño(){
        return this.año;   
    }
    public boolean fechaCorrecta(){
        boolean esCorrecta=true;
        if(this.mes==2&&this.dia<29&&this.año%4==0||this.mes==2&&this.dia<28&&this.año%4!=0||dia<1){
        esCorrecta=false;
        }
        if(mes<=1&&mes>8&&mes%2==0&&dia<30||mes<=8&&mes>12&&mes%2==0&&dia<30){
        esCorrecta=false;
        }
        if(mes<1||mes>12){
        esCorrecta=false;
        }
        return esCorrecta;
    }
    public void diaSiguiente(){

}
