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
    
    public String getNome() {
        return nome;
    }

    public void setNome(String umNome) {
        this.nome = umNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String umCpf) {
        this.cpf = umCpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String umTelefone) {
        this.telefone = umTelefone;
    }
    
    
}
