package br.edu.up.models;

import java.util.List;

public class Disciplina {
    private String nome;
    private int identificador;
    private String curriculo;
    private Professor professor;
    private List<Aluno> alunos;
    private List<Competencia> competencias;

    public Disciplina(String nome, int identificador, String curriculo, Professor professor, List<Aluno> alunos, List<Competencia> competencias){
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.alunos = alunos;
        this.competencias = competencias;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdentificador(){
        return identificador;
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public String getCurriculo(){
        return curriculo;
    }

    public void setCurriculo(String curriculo){
        this.curriculo = curriculo;
    }

    public Professor getProfessor(){
        return professor;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }

    public List<Competencia> getCompetencias(){
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias){
        this.competencias = competencias;
    }
  
}
