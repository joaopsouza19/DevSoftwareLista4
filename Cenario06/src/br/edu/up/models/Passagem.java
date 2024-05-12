package br.edu.up.models;

import java.time.LocalDateTime;

public class Passagem {
    private int numeroAssento;
    private String classeAssento;
    private LocalDateTime dataVoo;

    public Passagem(int numeroAssento, String classeAssento, LocalDateTime dataVoo) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public LocalDateTime getDataVoo() {
        return dataVoo;
    }

    @Override
    public String toString() {
        return "Número de Assento: " + numeroAssento + ", Classe de Assento: " + classeAssento + ", Data do Voo: " + dataVoo;
    }
}
