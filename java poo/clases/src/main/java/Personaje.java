/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madeus
 */
public class Personaje {
        public String nombrePersonaje;
        private String habilidadPrincipal;
        private String habilidadSecundaria;
        private String afinidadElemental;
        private String debilidadElemental;
        private String armaDeCombate;
        private String posicionEnBatalla;
        private int dañoBase;
        private int probCriticoBase;
        private int dañoCriticoBase;
        private int velMovimientoBase;

        public Personaje(String nombrePersonaje, String habilidadPrincipal, String habilidadSecundaria,String afinidadElemental,String posicionEnBatalla) {
            this.nombrePersonaje=nombrePersonaje;
            this.habilidadPrincipal=habilidadPrincipal;
            this.habilidadSecundaria=habilidadSecundaria;
            this.afinidadElemental=afinidadElemental;
            this.posicionEnBatalla=posicionEnBatalla;
            switch (posicionEnBatalla){
                case "dps" :
                    setDañoBase(150);
                    setProbCriticoBase(15);
                    setDañoCriticoBase(50);
                    setVelMovimientoBase(15);
                    break;
                default :   
                    setDañoBase(100);
                    setProbCriticoBase(10);
                    setDañoCriticoBase(40);
                    setVelMovimientoBase(10);
            }
        }
        public void setDañoBase(int daño){
            this.dañoBase = daño;
        }
        public void setProbCriticoBase(int probCritico){
            this.probCriticoBase = probCritico;
        }
        public void setDañoCriticoBase(int dañoCritico){
            this.dañoCriticoBase = dañoCritico;
        }
        public void setVelMovimientoBase(int velMovimientoBase){
            this.velMovimientoBase = velMovimientoBase;
        }
        public int getDañoBase(){
            return dañoBase;
        }
        public int getProbCriticoBase(){
            return probCriticoBase;
        }
        public int getDañoCriticoBase(){
            return dañoCriticoBase;
        }
        public int getVelMovimientoBase(){
            return velMovimientoBase;
        }
        public String getNombrePersonaje(){
            return nombrePersonaje;
        }
        public String getHabilidadPrincipal(){
            return habilidadPrincipal;
        }
        public String getHabilidadSecundaria(){
            return habilidadSecundaria;
        }
        public String getAfinidadElemental(){
            return afinidadElemental;
        }
        public String getDebilidadElemental(){
            return debilidadElemental;
        }
        public String getArmaDeCombate(){
            return armaDeCombate;
        }
        public String getPosicionEnBatalla(){
            return posicionEnBatalla;
        }

        public void mostrarPersonaje(){
            System.out.println("Nombre:");
            System.out.println(getNombrePersonaje());
        }
        
}
