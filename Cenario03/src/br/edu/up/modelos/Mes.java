package br.edu.up.modelos;

public class Mes {
    private int qtdeDias;
    private Dia[] dias;
    private int mes;

    public Mes(int qtdeDias, int mes){
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
        this.mes = mes;
        for (int i = 0; i < qtdeDias; i++){
            dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes){
        if (diaMes >= 1 && diaMes <= qtdeDias){
            dias[diaMes - 1].adicionarCompromisso(comp);
        } else {
            System.out.println("Dia inválido para adicionar compromisso.");
        }
    }

    public void excluirCompromisso(int diaMes, int hora){
        if (diaMes >= 1 && diaMes <= qtdeDias){
            dias[diaMes - 1].excluirCompromisso(hora);
        } else {
            System.out.println("Dia inválido para excluir compromisso.");
        }
    }

    public void listarCompromissos(int diaMes){
        if (diaMes >= 1 && diaMes <= qtdeDias){
            dias[diaMes - 1].listarCompromissos();
        } else {
            System.out.println("Dia inválido para listar compromissos.");
        }
    }

    public void listarCompromissos(){
        System.out.println("Compromissos do mês " + mes + ":");
        for (int i = 0; i < qtdeDias; i++){
            System.out.println("Dia " + (i + 1) + ":");
            dias[i].listarCompromissos();
        }
    }

    public int getMes(){
        return mes;
    }
}
