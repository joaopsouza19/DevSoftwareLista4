package br.edu.up.controllers;

import br.edu.up.view.IUsuario;
import br.edu.up.models.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private IUsuario view;
    private List<Passageiro> passageiros;
    private List<Comandante> comandantes;
    private List<Comissario> comissarios;
    private List<Aeronave> aeronaves;

    public Controlador(IUsuario view) {
        this.view = view;
        this.passageiros = new ArrayList<>();
        this.comandantes = new ArrayList<>();
        this.comissarios = new ArrayList<>();
        this.aeronaves = new ArrayList<>();
    }

    public void adicionarPassageiro() {
        String nome = view.lerString("Nome do passageiro: ");
        String rg = view.lerString("RG do passageiro: ");
        String identificadorBagagem = view.lerString("Identificador de bagagem: ");
        int numeroAssento = view.lerInt("Número do assento: ");
        String classeAssento = view.lerString("Classe do assento: ");
        LocalDateTime dataVoo = LocalDateTime.now(); // Supondo que a data do voo seja a data atual
        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, new Passagem(numeroAssento, classeAssento, dataVoo));
        passageiros.add(passageiro);
        view.mostrarMensagem("Passageiro adicionado com sucesso!");
    }

    public void adicionarComandante() {
        String nome = view.lerString("Nome do comandante: ");
        String rg = view.lerString("RG do comandante: ");
        String identificacaoAeronautica = view.lerString("Identificação aeronáutica: ");
        String matriculaFuncionario = view.lerString("Matrícula do funcionário: ");
        int horasVoo = view.lerInt("Total de horas de voo: ");
        Comandante comandante = new Comandante(nome, rg, identificacaoAeronautica, matriculaFuncionario, horasVoo);
        comandantes.add(comandante);
        view.mostrarMensagem("Comandante adicionado com sucesso!");
    }

    public void adicionarComissario() {
        String nome = view.lerString("Nome do comissário: ");
        String rg = view.lerString("RG do comissário: ");
        String identificacaoAeronautica = view.lerString("Identificação aeronáutica: ");
        String matriculaFuncionario = view.lerString("Matrícula do funcionário: ");
        List<String> idiomasFluencia = new ArrayList<>();
        int opcao;
        do {
            String idioma = view.lerString("Idioma de fluência (ou 'fim' para encerrar): ");
            if (idioma.equalsIgnoreCase("fim")) {
                break;
            }
            idiomasFluencia.add(idioma);
            opcao = view.lerInt("Adicionar mais idiomas? (1 - Sim, 2 - Não): ");
        } while (opcao == 1);
        Comissario comissario = new Comissario(nome, rg, identificacaoAeronautica, matriculaFuncionario, idiomasFluencia);
        comissarios.add(comissario);
        view.mostrarMensagem("Comissário adicionado com sucesso!");
    }

    public void adicionarAeronave() {
        String codigo = view.lerString("Código da aeronave: ");
        String tipo = view.lerString("Tipo da aeronave: ");
        int quantidadeAssentos = view.lerInt("Quantidade de assentos da aeronave: ");
        Aeronave aeronave = new Aeronave(codigo, tipo, quantidadeAssentos);
        aeronaves.add(aeronave);
        view.mostrarMensagem("Aeronave adicionada com sucesso!");
    }

    public void listarPassageiros() {
        view.mostrarLista(passageiros);
    }

    public void listarComandantes() {
        view.mostrarLista(comandantes);
    }

    public void listarComissarios() {
        view.mostrarLista(comissarios);
    }

    public void listarAeronaves() {
        view.mostrarLista(aeronaves);
    }

    public void iniciar() {
        while (true) {
            view.mostrarMenu();
            int opcao = view.lerInt("Opção: ");
    
            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarComandante();
                    break;
                case 3:
                    adicionarComissario();
                    break;
                case 4:
                    adicionarAeronave();
                    break;
                case 5:
                    listarPassageiros();
                    break;
                case 6:
                    listarComandantes();
                    break;
                case 7:
                    listarComissarios();
                    break;
                case 8:
                    listarAeronaves();
                    break;
                case 9:
                    view.mostrarMensagem("Saindo...");
                    return;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}

