package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class ControleEstacionamento {
    private List<Carro> carrosEstacionados;
    private int vagasDisponiveis;

    public ControleEstacionamento(int numeroVagas) {
        carrosEstacionados = new ArrayList<>();
        vagasDisponiveis = numeroVagas;
    }
}