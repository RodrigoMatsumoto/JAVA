package com.mycompany.aps;

import javax.swing.JOptionPane;

public class InterfaceUsuario {
    
    public static void main(String[] args) {
        InterfaceUsuario iu = new InterfaceUsuario();
        /*Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        GerenciaCliente cliente = new GerenciaCliente();
        cliente.adicionar(c1);
        cliente.adicionar(c2);
        cliente.existeCpf(c1);
        System.out.println(cliente.existeCpf(c2));*/
        Conta conta = new Conta();
        Banco banco = new Banco();
        banco.adicionar(conta);
        conta.imprimir();
    }
    
    public void menuInteragir() {
        String menu = JOptionPane.showInputDialog("=== Menu do Banco ===\n"
                + "1 - Cadastrar Cliente\n"
                + "2 - Cadastrar Conta\n"
                + "3 - Listar Conta\n"
                + "4 - Pesquisar Conta\n"
                + "5 - Depositar\n"
                + "6 - Debitar (Sacar)\n"
                + "7 - Transferir\n"
                + "8 - Remover Conta\n"
                + "9 - Sair\n"
                + "Escolha uma opção:");   
        int numeroMenu = Integer.parseInt(menu);
        
        switch(numeroMenu){
            case 1: JOptionPane.showMessageDialog(null, "opcao1");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        JOptionPane.showMessageDialog(null, menu);
    }
    
}
