package br.edu.up.controllers;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.models.Carro;

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
            System.out.println("O carro foi estacionado com sucesso!");
        } else {
            System.out.println("Não possui vagas disponíveis.");
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
                System.out.println("O carro foi retirado com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("O carro não foi encontrado no estacionamento.");
        }
    }

    public void emitirRelatorio() {
        System.out.println("O número de carros estacionados: " + carrosEstacionados.size());
        System.out.println("O número de vagas disponíveis: " + vagasDisponiveis);
        System.out.println("Valor arrecadado: R$ " + valorArrecadado);
    }
}
