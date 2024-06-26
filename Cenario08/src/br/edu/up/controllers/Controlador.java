package br.edu.up.controllers;

import br.edu.up.models.*;
import br.edu.up.Prompt;
import br.edu.up.view.IUsuario;

public class Controlador {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        IUsuario menu = new IUsuario();

        int opcao;
        do {
            opcao = menu.exibirMenu();
            switch (opcao) {
                case 1:
                    int codigo1 = menu.lerCodigo();
                    String nome1 = menu.lerNome();
                    String telefone1 = menu.lerTelefone();
                    String aniversario1 = menu.lerAniversario();
                    agenda.adicionar(new Pessoal(codigo1, nome1, telefone1, aniversario1));
                    break;
                case 2:
                    int codigo2 = menu.lerCodigo();
                    String nome2 = menu.lerNome();
                    String telefone2 = menu.lerTelefone();
                    String cnpj2 = menu.lerCnpj();
                    agenda.adicionar(new Comercial(codigo2, nome2, telefone2, cnpj2));
                    break;
                case 3:
                    int codigo3 = menu.lerCodigo();
                    agenda.excluirContato(codigo3);
                    break;
                case 4:
                    int codigo4 = menu.lerCodigo();
                    Contato contato = agenda.getContato(codigo4);
                    if (contato != null) {
                        Prompt.imprimir("Contato encontrado:\n" + contato);
                    } else {
                        Prompt.imprimir("Contato não encontrado.");
                    }
                    break;
                case 5:
                    Prompt.imprimir("Lista de Contatos:");
                    Prompt.imprimir(agenda.listarContatos());
                    break;
                case 6:
                    Prompt.imprimir("Saindo...");
                    break;
                default:
                    Prompt.imprimir("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 6);

        menu.fecharScanner();
    }
}