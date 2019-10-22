package com.mycompany.aps;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Conta {
    private static int sequenciaNumeroConta = 1;
    private int numero;
    private Cliente cliente;
    private LocalDate dataAbertura;
    protected double saldo;
    
    public Conta(){
        this.numero = sequenciaNumeroConta++;
        this.dataAbertura = LocalDate.now();
        this.saldo = 0.00;
    }
    
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

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente umCliente) {
        this.cliente = umCliente;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate umaDataAbertura) {
        this.dataAbertura = umaDataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double umSaldo) {
        this.saldo = umSaldo;
    }
    
    
}
