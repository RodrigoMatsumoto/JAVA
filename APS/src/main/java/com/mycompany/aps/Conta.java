package com.mycompany.aps;

import java.time.LocalDate;

public class Conta {
    private static int numero = 0;
    private Cliente cliente;
    private LocalDate dataAbertura;
    protected double saldo;
    
    public void depositar(double quantia) {
        this.saldo = this.saldo + quantia;
    }
    
    public boolean debitar(double quantia) {
        if(quantia <= this.saldo) {
            this.saldo = this.saldo - quantia;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transferir(Conta destino, double quantia) {
        if(quantia > this.saldo) {
            return false;
        } else {
            destino.depositar(quantia);
            return true;
        }
    }
    
    public void imprimir() {
        System.out.println("Numero conta: " + this.numero);
        this.cliente.imprimir();
        System.out.println("Data de abertura: " + this.dataAbertura);
        System.out.println("Saldo: " + this.saldo);
    }
}
