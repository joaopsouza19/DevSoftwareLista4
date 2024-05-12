package br.edu.up.models;

public class Aluno {
    private String nome;
    private String rg;
    private int anoIngresso;
    private String curso;
    private String turno;

    public Aluno (String nome, String rg, int anoIngresso, String curso, String turno){
        this.nome = nome;
        this.rg = rg;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.turno = turno;
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

    public int getAnoIngresso(){
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getTurno(){
        return turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }

}
