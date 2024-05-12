package br.edu.up.modelos;

import br.edu.up.Prompt;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];
        for (int i = 0; i < 12; i++) {
            this.meses[i] = new Mes(diasNoMes(i + 1), i + 1);
        }
    }

    public void adicionarMes(Mes mes) {
        int indiceMes = mes.getMes() - 1;
        if (indiceMes >= 0 && indiceMes < 12) {
            meses[indiceMes] = mes;
        } else {
            Prompt.imprimir("Mês inválido.");
        }
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        int indexMes = nomeParaIndiceMes(nomeMes);
        if (indexMes != -1) {
            Prompt.imprimir(
                    "Excluindo compromisso do dia " + diaMes + " do mês " + nomeMes + " às " + hora + " horas.");
            meses[indexMes].excluirCompromisso(diaMes, hora);
            Prompt.imprimir("Compromisso excluído com sucesso.");
        } else {
            Prompt.imprimir("Mês não encontrado.");
        }
    }

    public void listarCompromissos(String nomeMes) {
        int indexMes = nomeParaIndiceMes(nomeMes);
        if (indexMes != -1) {
            meses[indexMes].listarCompromissos();
        } else {
            Prompt.imprimir("Mês não encontrado.");
        }
    }

    public void listarCompromissos() {
        for (int i = 0; i < 12; i++) {
            meses[i].listarCompromissos();
        }
    }

    private int diasNoMes(int mes) {
        return 30;
    }

    private int nomeParaIndiceMes(String nomeMes) {
        switch (nomeMes.toLowerCase()) {
            case "janeiro":
                return 0;
            case "fevereiro":
                return 1;
            case "março":
                return 2;
            case "abril":
                return 3;
            case "maio":
                return 4;
            case "junho":
                return 5;
            case "julho":
                return 6;
            case "agosto":
                return 7;
            case "setembro":
                return 8;
            case "outubro":
                return 9;
            case "novembro":
                return 10;
            case "dezembro":
                return 11;
            default:
                return -1;
        }
    }
}
