
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madeus
 */
public class cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    boolean cuentaCreada=false;
    int continuar=0;
        String nombreCliente = JOptionPane.showInputDialog(
        null,
        "ingrese su nombre",
        JOptionPane.QUESTION_MESSAGE);
        String numeroCuenta = JOptionPane.showInputDialog(
        null,
        "ingrese su Numero de Cuenta",
        JOptionPane.QUESTION_MESSAGE); 
        cuentaBancaria cliente=new cuentaBancaria(nombreCliente,numeroCuenta,5000);
        cuentaCreada=true;
    while(continuar==0){    
        int seleccion = JOptionPane.showOptionDialog(
        null,
        "Que operacion desea realizar?", 
        "Red de cajeros Trencitobank",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,    // null para icono por defecto.
        new Object[] { "Consulta Saldo", "Deposito", "Giro","transferencia" },   // null para YES, NO y CANCEL
        "Consulta Saldo");    
        switch(seleccion){
            case 0:
                JOptionPane.showMessageDialog(
                null,
                "su saldo es $"+ cliente.getSaldo());
                break;
            case 1:
                    String montoDeposito = JOptionPane.showInputDialog(
                    null,
                    "ingrese el monto que desea depositar",
                    JOptionPane.QUESTION_MESSAGE);  // el icono sera un iterrogante
                    int montoInt = Integer.parseInt(montoDeposito);

                    JOptionPane.showMessageDialog(
                    null,
                    cliente.deposito(montoInt) );     
                break;
            case 2:
                    String montoGiro = JOptionPane.showInputDialog(
                    null,
                    "su saldo es " + cliente.getSaldo() + " ingrese el monto que desea retirar",
                    JOptionPane.QUESTION_MESSAGE);  // el icono sera un iterrogante
                    int montoGiroInt = Integer.parseInt(montoGiro);
                    JOptionPane.showMessageDialog(
                    null,
                    cliente.giro(montoGiroInt) );     
                break;
            case 3:
                    String montoTransferencia = JOptionPane.showInputDialog(
                    null,
                    "su saldo es " + cliente.getSaldo() + " ingrese el monto que desea retirar",
                    JOptionPane.QUESTION_MESSAGE);  // el icono sera un iterrogante
                    int montoTransferenciaInt = Integer.parseInt(montoTransferencia);
                           String nombreTransferencia = JOptionPane.showInputDialog(
                    null,
                    "ingrese nombre de cliente de transferencia",
                    JOptionPane.QUESTION_MESSAGE);
                    String cuentaTransfenrecia = JOptionPane.showInputDialog(
                    null,
                    "ingrese su Numero de Cuenta de transferencia",
                    JOptionPane.QUESTION_MESSAGE); 
                    
                    cliente.transferencia(montoTransferenciaInt,cuentaTransfenrecia,nombreTransferencia);     
                break;
        } 
        continuar = JOptionPane.showOptionDialog(
        null,
        "Desea realizar otra operacion?", 
        "Red de cajeros Trencitobank",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,    // null para icono por defecto.
        new Object[] { "Si", "No" },   // null para YES, NO y CANCEL
        "No");

        }
    }
    
}
