package br.edu.up.view;

import java.util.List;
import java.util.Scanner;
import br.edu.up.Prompt;

public class IUsuario {
    private Scanner scanner;

    public IUsuario(){
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        Prompt.imprimir("Selecione uma opção:");
        Prompt.imprimir("1. Adicionar passageiro");
        Prompt.imprimir("2. Adicionar comandante");
        Prompt.imprimir("3. Adicionar comissário");
        Prompt.imprimir("4. Adicionar aeronave");
        Prompt.imprimir("5. Listar passageiros");
        Prompt.imprimir("6. Listar tripulação");
        Prompt.imprimir("7. Listar comissários");
        Prompt.imprimir("8. Listar aeronaves");
        Prompt.imprimir("9. Sair");
    }

    public String lerString(String prompt){
        Prompt.imprimir(prompt);
        return scanner.nextLine();
    }

    public int lerInt(String prompt){
        Prompt.imprimir(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarMensagem(String mensagem){
        Prompt.imprimir(mensagem);
    }

    public void mostrarLista(List<?> lista){
        for (Object item : lista){
            Prompt.imprimir(item);
        }
    }
}

