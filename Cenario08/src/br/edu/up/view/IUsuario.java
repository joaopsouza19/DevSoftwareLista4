package br.edu.up.view;

import java.util.Scanner;

public class IUsuario {
    private Scanner scanner;

    public IUsuario() {
        scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public int lerCodigo() {
        System.out.print("Digite o código do contato: ");
        return scanner.nextInt();
    }

    public String lerNome() {
        System.out.print("Digite o nome do contato: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String lerTelefone() {
        System.out.print("Digite o telefone do contato: ");
        return scanner.nextLine();
    }

    public String lerAniversario() {
        System.out.print("Digite o aniversário (DD/MM/YYYY): ");
        return scanner.nextLine();
    }

    public String lerCnpj() {
        System.out.print("Digite o CNPJ do contato comercial: ");
        return scanner.nextLine();
    }

    public void fecharScanner() {
        scanner.close();
    }
}

