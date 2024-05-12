package br.edu.up.view;

import br.edu.up.controllers.ControleEstacionamento;
import br.edu.up.models.Carro;
import java.util.Scanner;
import br.edu.up.Prompt;

public class UsuarioInterface {
    private ControleEstacionamento controller;

    public UsuarioInterface(ControleEstacionamento controller) {
        this.controller = controller;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            Prompt.imprimir("<><><>Escolha uma opção:<><><>");
            Prompt.imprimir("1 - Registrar uma entrada de carro");
            Prompt.imprimir("2 - Registrar uma saída de carro");
            Prompt.imprimir("3 - Gerar um relatório");
            Prompt.imprimir("4 - Sair do menu");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    Prompt.imprimir("Digite o modelo do carro:");
                    String modelo = scanner.nextLine();
                    Prompt.imprimir("Digite a placa do carro:");
                    String placa = scanner.nextLine();
                    Prompt.imprimir("Digite a cor do carro:");
                    String cor = scanner.nextLine();
                    Carro novoCarro = new Carro(modelo, placa, cor);
                    controller.entradaCarro(novoCarro);
                    break;
                case 2:
                    Prompt.imprimir("Digite a placa do carro que saiu:");
                    placa = scanner.nextLine();
                    controller.saidaCarro(placa);
                    break;
                case 3:
                    controller.emitirRelatorio();
                    break;
                case 4:
                    Prompt.imprimir("Saindo do programa...");
                    break;
                default:
                    Prompt.imprimir("Opção inválida!");
            }
        } while (opcao != 4);
        scanner.close();
    }
}