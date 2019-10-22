package com.mycompany.aps;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Banco {
    private ArrayList<Conta> listaConta = new ArrayList<Conta>();

    public ArrayList<Conta> getListaConta() {
        return listaConta;
    }
    
    public void adicionar(Conta c) {
        Cliente cliente = new Cliente();
        GerenciaCliente gc1 = new GerenciaCliente();
        gc1.adicionar(cliente);
        c.setCliente(cliente);
        listaConta.add(c);
    }
    /*
    public String listar() {
        
    }
    
    public String pesquisar(int numero) {
        
    }
    
    public Conta getConta(int numero) {
        
    }
    
    public boolean remover(int numero) {
        
    }  */
}
