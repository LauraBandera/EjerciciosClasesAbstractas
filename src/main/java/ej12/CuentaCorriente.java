/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;

/**
 *
 * @author laura
 */
public class CuentaCorriente extends Cuenta{
    final private double interes = 1.5, saldoMin = 1000;

    public CuentaCorriente(Persona cliente) {
        super(cliente);
    }

    public double getInteres() {
        return interes;
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente{" + "interes=" + interes + '}';
    }

    @Override
    public void actualizarSaldo(double extra) {
        if(super.getSaldo() < saldoMin){
            super.setSaldo(super.getSaldo () + super.getSaldo()*interes);
        }else{
            super.setSaldo(super.getSaldo () + saldoMin*interes);
        }
        
    }

    @Override
    public void retirar(double dinero) {
        if(dinero < super.getSaldo()){
            super.setSaldo(super.getSaldo()-dinero);
        }else{
            System.out.println("No se ha podido extraer el dinero");
        }
    }
    
}
