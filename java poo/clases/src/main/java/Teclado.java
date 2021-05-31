/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madeus
 */
        public class  Teclado {
        private int numeroDeTeclas;
        private String marca;
        private String modelo;
        public Teclado(int a, String m, String mod) {
            modelo=mod;
            marca=m;
            numeroDeTeclas=a;
        }

        public Teclado(int a, String m) {
            modelo="Sin Modelo";
            marca=m;
            numeroDeTeclas=a;
        }

        public Teclado() {
            modelo="Sin Modelo";
            marca="Sin Definir";
            numeroDeTeclas=0000;
        }
        }