package br.edu.up.controllers;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.models.Carro;
import br.edu.up.Prompt;

public class ControleEstacionamento {
    private List<Carro> carrosEstacionados;
    private int vagasDisponiveis;
    private int valorArrecadado;

    public ControleEstacionamento() {
        carrosEstacionados = new ArrayList<>();
        vagasDisponiveis = 10;
        valorArrecadado = 0;
    }

    public void entradaCarro(Carro carro) {
        if (vagasDisponiveis > 0) {
            carrosEstacionados.add(carro);
            vagasDisponiveis--;
            Prompt.imprimir("O carro foi estacionado com sucesso!");
        } else {
            Prompt.imprimir("Não possui vagas disponíveis.");
        }
    }

    public void saidaCarro(String placa) {
        boolean encontrado = false;
        for (Carro carro : carrosEstacionados) {
            if (carro.getPlaca().equals(placa)) {
                carrosEstacionados.remove(carro);
                vagasDisponiveis++;
                valorArrecadado += 5;
                encontrado = true;
                Prompt.imprimir("O carro foi retirado com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            Prompt.imprimir("O carro não foi encontrado no estacionamento.");
        }
    }

    public void emitirRelatorio() {
        Prompt.imprimir("O número de carros estacionados: " + carrosEstacionados.size());
        Prompt.imprimir("O número de vagas disponíveis: " + vagasDisponiveis);
        Prompt.imprimir("Valor arrecadado: R$ " + valorArrecadado);
    }
}
