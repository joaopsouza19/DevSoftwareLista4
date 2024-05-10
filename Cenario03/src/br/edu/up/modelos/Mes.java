package br.edu.up.modelos;

import br.edu.up.Prompt;

public class Mes {
    private int qtdeDias;
    private Dia[] dias;
    private int mes;

    public Mes(int qtdeDias, int mes) {
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
        this.mes = mes;
        for (int i = 0; i < qtdeDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            dias[diaMes - 1].adicionarCompromisso(comp);
        } else {
            Prompt.imprimir("Dia inválido para adicionar compromisso.");
        }
    }

    public void excluirCompromisso(int diaMes, int hora) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            dias[diaMes - 1].excluirCompromisso(hora);
        } else {
            Prompt.imprimir("Dia inválido para excluir compromisso.");
        }
    }

    public void listarCompromissos(int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            dias[diaMes - 1].listarCompromissos();
        } else {
            Prompt.imprimir("Dia inválido para listar compromissos.");
        }
    }

    public void listarCompromissos() {
        Prompt.imprimir("Compromissos do mês " + mes + ":");
        for (int i = 0; i < qtdeDias; i++) {
            Prompt.imprimir("Dia " + (i + 1) + ":");
            dias[i].listarCompromissos();
        }
    }

    public int getMes() {
        return mes;
    }
}
