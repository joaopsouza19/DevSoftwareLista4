package br.edu.up.view;

import br.edu.up.controllers.ControleEstacionamento;
import br.edu.up.models.Carro;
import java.util.Scanner;

public class UsuarioInterface {
    private ControleEstacionamento controller;

    public UsuarioInterface(ControleEstacionamento controller) {
        this.controller = controller;
    }

    public void exibirMenu(){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("<><><>Escolha uma opção:<><><>");
            System.out.println("1 - Registrar uma entrada de carro");
            System.out.println("2 - Registrar uma saída de carro");
            System.out.println("3 - Gerar um relatório");
            System.out.println("4 - Sair do menu");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o modelo do carro:");
                    String modelo = scanner.nextLine();
                    System.out.println("Digite a placa do carro:");
                    String placa = scanner.nextLine();
                    System.out.println("Digite a cor do carro:");
                    String cor = scanner.nextLine();
                    Carro novoCarro = new Carro(modelo, placa, cor);
                    controller.entradaCarro(novoCarro);
                    break;
                case 2:
                    System.out.println("Digite a placa do carro que saiu:");
                    placa = scanner.nextLine();
                    controller.saidaCarro(placa);
                    break;
                case 3:
                    controller.emitirRelatorio();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
        scanner.close();
    }
}