/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;

import java.util.Random;

/**
 *
 * @author laura
 */
public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;
    
    private Random aleatorio = new Random();
   
    public Cuenta(Persona cliente) {
        this.numeroCuenta = this.algoritmoCuenta();
        this.saldo = 0;
        this.cliente = cliente;
    }
    
    private String algoritmoCuenta(){
        String cuenta = "";
        cuenta += aleatorio.nextInt(999999999);
        cuenta += aleatorio.nextInt(999999999);
        cuenta += aleatorio.nextInt(99);
        return cuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    
    public abstract void actualizarSaldo(double extra);
    
    public abstract void retirar(double dinero);
}
