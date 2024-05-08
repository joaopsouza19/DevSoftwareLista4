package br.edu.up.modelos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];
        for (int i = 0; i < 12; i++) {
            this.meses[i] = new Mes(diasNoMes(i + 1));
        }
    }

    public void adicionarMes(Mes mes) {
        for (int i = 0; i < meses.length; i++) {
            if (meses[i] == null) {
                meses[i] = mes;
                return;
            }
        }
        System.out.println("Não foi possível adicionar o mês. O array de meses está cheio.");
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        int indexMes = nomeParaIndiceMes(nomeMes);
        if (indexMes != -1) {
            meses[indexMes].excluirCompromisso(diaMes, hora);
        } else {
            System.out.println("Mês não encontrado.");
        }
    }

    public void listarCompromissos(String nomeMes) {
        int indexMes = nomeParaIndiceMes(nomeMes);
        if (indexMes != -1) {
            meses[indexMes].listarCompromissos();
        } else {
            System.out.println("Mês não encontrado.");
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
