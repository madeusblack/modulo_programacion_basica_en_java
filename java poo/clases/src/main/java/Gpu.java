/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madeus
 */
public class  Gpu {
        private int memoriaEnGb;
        private String marca;
        private String modelo;
        private String SoporteDX;
        
        public Gpu(int a, String m, String mod, String DX) {
            modelo=mod;
            marca=m;
            memoriaEnGb=a;
            SoporteDX=DX;

        }

        public Gpu(int a, String m,String DX) {
            modelo="Sin Modelo";
            marca=m;
            memoriaEnGb=a;
            SoporteDX=DX;

        }

        public Gpu() {
            modelo="Sin Modelo";
            marca="Sin Definir";
            memoriaEnGb=0000;
            SoporteDX="No Definido";

        }
    }