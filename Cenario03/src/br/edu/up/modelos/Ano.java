package br.edu.up.modelos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto){
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];
        for (int i = 0; i < 12; i++){
            this.meses[i] = new Mes(diasNoMes(i + 1));
        }
    }
}