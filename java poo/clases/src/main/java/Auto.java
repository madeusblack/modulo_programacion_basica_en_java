/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madeus
 */
    public class  Auto {
        private int añoFabricacion;
        private String marca;
        private String modelo;
        public Auto(int a, String m, String mod) {
            modelo=mod;
            marca=m;
            añoFabricacion=a;
        }

        public Auto(int a, String m) {
            modelo="Sin Modelo";
            marca=m;
            añoFabricacion=a;
        }

        public Auto() {
            modelo="Sin Modelo";
            marca="Sin Definir";
            añoFabricacion=0000;
        }
    }
