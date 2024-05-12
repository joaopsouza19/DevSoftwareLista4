package br.edu.up.models;

public class Competencia {
    private String descricao;
    private boolean necessaria;
    private boolean atingida;

    public Competencia(String descricao, boolean necessaria, boolean atingida){
        this.descricao = descricao;
        this.necessaria = necessaria;
        this.atingida = atingida;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public boolean isNecessaria(){
        return necessaria;
    }

    public void setNecessaria(boolean necessaria){
        this.necessaria = necessaria;
    }

    public boolean isAtingida(){
        return atingida;
    }

    public void setAtingida(boolean atingida){
        this.atingida = atingida;
    }
    
}

