package com.mycompany.aps;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("C.P.F: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
    }
}
