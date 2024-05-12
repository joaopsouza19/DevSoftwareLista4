package br.edu.up.models;

public class Professor {
    private String nome;
    private String rg;
    private String identificacaoCurriculoLattes;
    private Titulacao titulacao;

    public Professor (String nome, String rg, String identificacaoCurriculoLattes, Titulacao titulacao){
        this.nome = nome;
        this.rg = rg;
        this.identificacaoCurriculoLattes = identificacaoCurriculoLattes;
        this.titulacao = titulacao;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRg(){
        return rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getIdentificacaoCurriculoLattes(){
        return identificacaoCurriculoLattes;
    }

    public void setIdentificacaoCurriculoLattes(String identificacaoCurriculoLattes){
        this.identificacaoCurriculoLattes = identificacaoCurriculoLattes;
    }

    public Titulacao getTitulacao(){
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao){
        this.titulacao = titulacao;
    }
    
}
