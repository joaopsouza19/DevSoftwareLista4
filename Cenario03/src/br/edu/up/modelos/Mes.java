package br.edu.up.modelos;

public class Mes {
    private int qtdeDias;
    private Dia[] dias;

    public Mes(int qtdeDias) {
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }
}
