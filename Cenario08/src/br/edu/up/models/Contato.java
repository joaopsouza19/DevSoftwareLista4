package br.edu.up.models;

public abstract class Contato {
    private int codigo;
    private String nome;
    private String telefone;

    public Contato(int codigo, String nome, String telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }

    @Override
    public String toString(){
        return "Código: " + codigo + ", Nome: " + nome + ", Telefone: " + telefone;
    }
}
