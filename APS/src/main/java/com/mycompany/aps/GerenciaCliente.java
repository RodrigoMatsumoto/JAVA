package com.mycompany.aps;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciaCliente {
    private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }
    
    public void adicionar(Cliente cliente) {
        String nome = JOptionPane.showInputDialog("Nome:");
        cliente.setNome(nome);
        
        String cpf = JOptionPane.showInputDialog("CPF:");
        cliente.setCpf(cpf);
        
        String telefone = JOptionPane.showInputDialog("Telefone:");
        cliente.setTelefone(telefone);
        
        listaCliente.add(cliente);
    }
    /*
    public String listar() {
  
    }
    */
    
    public boolean existeCpf(Cliente cliente) {
        boolean temCpf = false;
        for(int i = 0; i < listaCliente.size(); i++){
            temCpf = cliente.getCpf().equals(listaCliente.get(i).getCpf());
        }
        return temCpf;
    }
}
