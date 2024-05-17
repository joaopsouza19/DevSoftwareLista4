package br.edu.up.controllers;

import br.edu.up.models.*;
import br.edu.up.view.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controladora {
    private List<Seguro> seguros = new ArrayList<>();
    private IUsuario view = new IUsuario();

    public void incluirSeguro(Seguro seguro){
        for (Seguro s : seguros) {
            if (s.getApolice().equals(seguro.getApolice())){
                view.mostrarMensagem("Apólice já existente!");
                return;
            }
        }
        seguros.add(seguro);
        view.mostrarMensagem("Seguro incluído com sucesso!");
    }

    public Seguro localizarSeguro(String apolice){
        for (Seguro s : seguros){
            if (s.getApolice().equals(apolice)){
                return s;
            }
        }
        view.mostrarMensagem("Seguro não encontrado!");
        return null;
    }

    public void excluirSeguro(String apolice){
        Seguro seguro = localizarSeguro(apolice);
        if (seguro != null){
            seguros.remove(seguro);
            view.mostrarMensagem("Seguro excluído com sucesso!");
        }
    }

    public void excluirTodosSeguros(){
        Scanner scanner = new Scanner(System.in);
        view.mostrarMensagem("Você tem certeza que deseja excluir todos os seguros? (s/n)");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("s")){
            seguros.clear();
            view.mostrarMensagem("Todos os seguros foram excluídos!");
        } else {
            view.mostrarMensagem("Operação cancelada.");
        }
    }

    public int quantidadeSeguros(){
        return seguros.size();
    }

    public void listarTodosSeguros(){
        if (seguros.isEmpty()){
            view.mostrarMensagem("Nenhum seguro cadastrado.");
        } else {
            for (Seguro s : seguros){
                view.mostrarMensagem(s.getDados());
            }
        }
    }

    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            view.mostrarMenu();
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao){
                case 1:
                    incluirNovoSeguro(scanner);
                    break;
                case 2:
                    localizarSeguroInterface(scanner);
                    break;
                case 3:
                    excluirSeguroInterface(scanner);
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    view.mostrarMensagem("Quantidade de seguros: " + quantidadeSeguros());
                    break;
                case 7:
                    view.mostrarMensagem("Saindo do programa.");
                    System.exit(0);
                    break;
                default:
                    view.mostrarMensagem("Opção inválida!");
            }
        }
    }

    private void incluirNovoSeguro(Scanner scanner){
        view.mostrarMensagem("Digite o tipo de seguro (1 - Vida, 2 - Veículo): ");
        int tipo = Integer.parseInt(scanner.nextLine());

        Seguro seguro;
        if (tipo == 1){
            seguro = new SeguroVida();
            view.mostrarMensagem("Cobre doença? (true/false): ");
            ((SeguroVida) seguro).setCobreDoenca(Boolean.parseBoolean(scanner.nextLine()));
            view.mostrarMensagem("Cobre acidente? (true/false): ");
            ((SeguroVida) seguro).setCobreAcidente(Boolean.parseBoolean(scanner.nextLine()));
        } else if (tipo == 2){
            seguro = new SeguroVeiculo();
            view.mostrarMensagem("Valor da franquia: ");
            ((SeguroVeiculo) seguro).setVlrFranquia(Double.parseDouble(scanner.nextLine()));
            view.mostrarMensagem("Tem carro reserva? (true/false): ");
            ((SeguroVeiculo) seguro).setTemCarroReserva(Boolean.parseBoolean(scanner.nextLine()));
            view.mostrarMensagem("Cobre vidros? (true/false): ");
            ((SeguroVeiculo) seguro).setCobreVidros(Boolean.parseBoolean(scanner.nextLine()));
        } else {
            view.mostrarMensagem("Tipo de seguro inválido!");
            return;
        }

        view.mostrarMensagem("Número da apólice: ");
        seguro.setApolice(scanner.nextLine());
        seguro.setSegurado(incluirSegurado(scanner));
        view.mostrarMensagem("Valor da apólice: ");
        seguro.setVlrApolice(Double.parseDouble(scanner.nextLine()));
        view.mostrarMensagem("Data de início (aaaa-mm-dd): ");
        seguro.setDtaInicio(LocalDate.parse(scanner.nextLine()));
        view.mostrarMensagem("Data de fim (aaaa-mm-dd): ");
        seguro.setDtaFim(LocalDate.parse(scanner.nextLine()));

        incluirSeguro(seguro);
    }

    private Segurado incluirSegurado(Scanner scanner){
        Segurado segurado = new Segurado();
        view.mostrarMensagem("Nome do segurado: ");
        segurado.setNome(scanner.nextLine());
        view.mostrarMensagem("RG do segurado: ");
        segurado.setRG(scanner.nextLine());
        view.mostrarMensagem("CPF do segurado: ");
        segurado.setCPF(scanner.nextLine());
        view.mostrarMensagem("Sexo do segurado (MASCULINO, FEMININO, OUTRO): ");
        segurado.setSexo(Segurado.Sexo.valueOf(scanner.nextLine().toUpperCase()));
        view.mostrarMensagem("Telefone do segurado: ");
        segurado.setTelefone(scanner.nextLine());
        view.mostrarMensagem("Endereço do segurado: ");
        segurado.setEndereco(scanner.nextLine());
        view.mostrarMensagem("CEP do segurado: ");
        segurado.setCEP(scanner.nextLine());
        view.mostrarMensagem("Cidade do segurado: ");
        segurado.setCidade(scanner.nextLine());
        return segurado;
    }

    private void localizarSeguroInterface(Scanner scanner){
        view.mostrarMensagem("Digite o número da apólice: ");
        String apolice = scanner.nextLine();
        Seguro seguro = localizarSeguro(apolice);
        if (seguro != null){
            view.mostrarMensagem(seguro.getDados());
        }
    }

    private void excluirSeguroInterface(Scanner scanner){
        view.mostrarMensagem("Digite o número da apólice: ");
        String apolice = scanner.nextLine();
        excluirSeguro(apolice);
    }
}
