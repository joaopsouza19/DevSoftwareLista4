package br.edu.up.modelos;

import br.edu.up.Prompt;

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
            Prompt.imprimir("Hora inválida para adicionar compromisso.");
        }
    }

    public Compromisso consultarCompromisso(int hora) {
        if (hora >= 0 && hora < 24) {
            return compromissos[hora];
        } else {
            Prompt.imprimir("Hora inválida para consultar compromisso.");
            return null;
        }
    }

    public void excluirCompromisso(int hora) {
        if (hora >= 0 && hora < 24) {
            if (compromissos[hora] != null) {
                Prompt.imprimir("Excluindo compromisso às " + hora + " horas: " + compromissos[hora].toString());
                compromissos[hora] = null;
                Prompt.imprimir("Compromisso excluído com sucesso.");
            } else {
                Prompt.imprimir("Nenhum compromisso encontrado para a hora " + hora + ".");
            }
        } else {
            Prompt.imprimir("Hora inválida para excluir compromisso.");
        }
    }

    public void listarCompromissos() {
        Prompt.imprimir("Compromissos do dia " + diaMes + ":");
        for (int i = 0; i < 24; i++) {
            if (compromissos[i] != null) {
                Prompt.imprimir(i + "h: " + compromissos[i].toString());
            }
        }
    }
}
