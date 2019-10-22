package com.mycompany.aps;

public class ContaEspecial extends Conta {
    private double limite;
    
    public ContaEspecial() {
        this.limite = 1000.00;
    }
    public boolean debitar(double quantia) {
        if(quantia <= this.saldo + this.limite) {
            this.saldo = this.saldo - quantia;
            return true;
        } else {
            return false;
        }
    }
    
    public void imprimir() {
        System.out.println("Limite = " + limite);
    }
}
