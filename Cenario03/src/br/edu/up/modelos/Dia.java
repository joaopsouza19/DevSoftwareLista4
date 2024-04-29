package br.edu.up.modelos;

public class Dia {
    public int diaMes;
    public Compromisso[] compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24];
        //
    }

    public void adicionarCompromisso(Compromisso comp) {
        int hora = comp.getHora();
        if (hora >= 0 && hora < 24) {
            compromissos[hora] = comp;
        } else {
            System.out.println("Hora inválida para adicionar compromisso.");
        }
    }

}
