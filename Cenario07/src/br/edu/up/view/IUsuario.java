package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.Prompt;


public class IUsuario {
    private Scanner scanner;

    public IUsuario(){
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        Prompt.imprimir("Selecione uma opção:");
        Prompt.imprimir("1. Adicionar professor");
        Prompt.imprimir("2. Adicionar aluno");
        Prompt.imprimir("3. Adicionar disciplina");
        Prompt.imprimir("4. Listar professores");
        Prompt.imprimir("5. Listar alunos");
        Prompt.imprimir("6. Listar disciplinas");
        Prompt.imprimir("7. Sair");
    }

    public String lerString(String mensagem){
        Prompt.imprimir(mensagem);
        return scanner.nextLine();
    }

    public int lerInt(String mensagem){
        Prompt.imprimir(mensagem);
        return Integer.parseInt(scanner.nextLine());
    }

}