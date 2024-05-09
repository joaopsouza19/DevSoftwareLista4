package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class ControleEstacionamento {
    private List<Carro> carrosEstacionados;
    private int vagasDisponiveis;

    public ControleEstacionamento(int numeroVagas){
        carrosEstacionados = new ArrayList<>();
        vagasDisponiveis = numeroVagas;
    }

    public void entradaCarro(Carro carro){
        if (vagasDisponiveis > 0){
            carrosEstacionados.add(carro);
            vagasDisponiveis--;
            System.out.println("O carro foi estacionado com sucesso!");
        } else {
            System.out.println("Não possui vagas disponíveis.");
        }
    }

    public void saidaCarro(String placa){
        boolean encontrado = false;
        for (Carro carro : carrosEstacionados){
            if (carro.getPlaca().equals(placa)){
                carrosEstacionados.remove(carro);
                vagasDisponiveis++;
                encontrado = true;
                System.out.println("O carro foi retirado com sucesso!");
                break;
            }
        }
        if (!encontrado){
            System.out.println("O carro não foi encontrado no estacionamento.");
        }
    }

    public void emitirRelatorio(){
        System.out.println("O número de carros estacionados: " + carrosEstacionados.size());
        System.out.println("O número de vagas disponíveis: " + vagasDisponiveis);
        System.out.println("O número de valor arrecadado: R$ " + (carrosEstacionados.size() * 5));
    }
}