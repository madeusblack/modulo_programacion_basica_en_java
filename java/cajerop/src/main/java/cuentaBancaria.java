/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madeus
 */
public class cuentaBancaria {
    private String nombreCliente;
    private String numeroCuenta;
    private double saldo;
    cuentaBancaria(){};
    cuentaBancaria(String nombreCliente,String numeroCuenta, double saldo){
    this.nombreCliente=nombreCliente;
    this.numeroCuenta=numeroCuenta;
    this.saldo=saldo;
    }
    public void setNombreCliente(String nombreCliente){
    this.nombreCliente=nombreCliente;
    }
    public void setNumeroCuenta(String numeroCuenta){
    this.numeroCuenta=numeroCuenta;
    }
    public void setSaldo(double saldo){
    this.saldo=saldo;
    }
    public String getNombreCliente(){
    return this.nombreCliente;
    }
    public String getNumeroCuenta(){
    return this.numeroCuenta;
    }
    public double getSaldo(){
    return this.saldo;
    }
    public String deposito(double montoDeposito){
    double saldoPrevio = getSaldo();
    setSaldo(saldoPrevio+montoDeposito);
    return "su saldo era $"+saldoPrevio+" su nuevo saldo es $"+getSaldo(); 
    }
    public String giro(double montoGiro){
        double saldoPrevio = getSaldo();
        if(montoGiro<=saldoPrevio){
            setSaldo(saldoPrevio-montoGiro);
            return "giro exitosamente $"+montoGiro+" su nuevo saldo es "+getSaldo();
        }else{
            return "saldo insuficiente para realizar la transacción";
        }
    }
    public String transferencia(double montoTransferencia,String numeroCuentaDestino,String nombreClienteDestino){
        double saldoPrevio = getSaldo();
        if(montoTransferencia<saldoPrevio){
            setSaldo(saldoPrevio-montoTransferencia);
            return "transfirio exitosamente $"+montoTransferencia+" a la cuenta "+ numeroCuentaDestino +" perteneciente a el cliente "+nombreClienteDestino+" su nuevo saldo es "+getSaldo();
        }else{
            return "saldo insuficiente para realizar la transacción";
        }
    }    
    
}
