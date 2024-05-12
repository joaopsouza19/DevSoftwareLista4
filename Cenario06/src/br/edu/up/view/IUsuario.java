package br.edu.up.view;

import java.util.List;
import java.util.Scanner;

public class IUsuario {
    private Scanner scanner;

    public IUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Adicionar passageiro");
        System.out.println("2. Adicionar comandante");
        System.out.println("3. Adicionar comissário");
        System.out.println("4. Adicionar aeronave");
        System.out.println("5. Listar passageiros");
        System.out.println("6. Listar tripulação");
        System.out.println("7. Listar comissários");
        System.out.println("8. Listar aeronaves");
        System.out.println("9. Sair");
    }

    public String lerString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public int lerInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarLista(List<?> lista) {
        for (Object item : lista) {
            System.out.println(item);
        }
    }
}

