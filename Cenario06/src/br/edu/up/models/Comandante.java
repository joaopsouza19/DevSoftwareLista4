package br.edu.up.models;

public class Comandante extends Tripulacao {
    private int horasVoo;

    public Comandante(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, int horasVoo){
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        this.horasVoo = horasVoo;
    }

    public int getHorasVoo(){
        return horasVoo;
    }

    @Override
    public String toString(){
        return super.toString() + ", Horas de Voo: " + horasVoo;
    }
}
