package br.edu.up.view;

import br.edu.up.Prompt;
import java.util.Scanner;

public class IUsuario {
    private Scanner scanner;

    public IUsuario() {
        scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        Prompt.imprimir("Menu:");
        Prompt.imprimir("1. Incluir um contato pessoal");
        Prompt.imprimir("2. Incluir um contato comercial");
        Prompt.imprimir("3. Excluir um contato pelo código");
        Prompt.imprimir("4. Consultar um contato pelo código");
        Prompt.imprimir("5. Listar todos os contatos");
        Prompt.imprimir("6. Sair do programa");
        Prompt.imprimir("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public int lerCodigo() {
        Prompt.imprimir("Digite o código do contato: ");
        return scanner.nextInt();
    }

    public String lerNome() {
        Prompt.imprimir("Digite o nome do contato: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String lerTelefone() {
        Prompt.imprimir("Digite o telefone do contato: ");
        return scanner.nextLine();
    }

    public String lerAniversario() {
        Prompt.imprimir("Digite o aniversário (DD/MM/YYYY): ");
        return scanner.nextLine();
    }

    public String lerCnpj() {
        Prompt.imprimir("Digite o CNPJ do contato comercial: ");
        return scanner.nextLine();
    }

    public void fecharScanner() {
        scanner.close();
    }
}

