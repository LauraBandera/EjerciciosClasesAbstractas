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
public class CuentaAhorro extends Cuenta{
    private double interes, comisionMantenimiento;

    public CuentaAhorro(double interes, double comisionMantenimiento, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionMantenimiento = comisionMantenimiento;
    }

    public double getInteres() {
        return interes;
    }

    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaAhorro{" + "interes=" + interes + ", comisionMantenimiento=" + comisionMantenimiento + '}';
    }

    @Override
    public void actualizarSaldo(double extra) {
        super.setSaldo(super.getSaldo () + super.getSaldo()*interes - comisionMantenimiento);
    }

    @Override
    public void retirar(double dinero) {
        super.setSaldo(super.getSaldo() - dinero);
    }
}
