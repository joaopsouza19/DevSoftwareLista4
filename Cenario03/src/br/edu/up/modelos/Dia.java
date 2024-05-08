package br.edu.up.modelos;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24];
    }

    public void adicionarCompromisso(Compromisso comp) {
        int hora = comp.getHora();
        if (hora >= 0 && hora < 24) {
            compromissos[hora] = comp;
        } else {
            System.out.println("Hora inválida para adicionar compromisso.");
        }
    }

    public Compromisso consultarCompromisso(int hora) {
        if (hora >= 0 && hora < 24) {
            return compromissos[hora];
        } else {
            System.out.println("Hora inválida para consultar compromisso.");
            return null;
        }
    }

    public void excluirCompromisso(int hora) {
        if (hora >= 0 && hora < 24) {
            compromissos[hora] = null;
        } else {
            System.out.println("Hora inválida para excluir compromisso.");
        }
    }

    public void listarCompromissos() {
        System.out.println("Compromissos do dia " + diaMes + ":");
        for (int i = 0; i < 24; i++) {
            if (compromissos[i] != null) {
                System.out.println(i + "h: " + compromissos[i].toString());
            }
        }
    }
}