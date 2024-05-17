package br.edu.up.controllers;

import java.util.HashMap;
import java.util.Map;
import br.edu.up.models.ClienteEmpresa;
import br.edu.up.models.ClientePessoa;
import br.edu.up.view.*;
import br.edu.up.Prompt;

public class Controladora {
    private IUsuario view;
    private Map<String, ClientePessoa> clientesPessoas;
    private Map<String, ClienteEmpresa> clientesEmpresas;

    public Controladora(IUsuario view){
        this.view = view;
        this.clientesPessoas = new HashMap<>();
        this.clientesEmpresas = new HashMap<>();
    }

    public void iniciar(){
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao){
                case 1:
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosClientePessoa();
                    break;
                case 4:
                    mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    emprestarParaClientePessoa();
                    break;
                case 6:
                    emprestarParaClienteEmpresa();
                    break;
                case 7:
                    devolverParaClientePessoa();
                    break;
                case 8:
                    devolverParaClienteEmpresa();
                    break;
                case 9:
                    view.mostrarMensagem("Saindo...");
                    break;
                default:
                    view.mostrarMensagem("Opçao inválida!");
            }
        } while (opcao != 9);
    }

    private void incluirClientePessoa(){
        ClientePessoa cliente = view.capturarDadosClientePessoa();
        clientesPessoas.put(cliente.getCPF(), cliente);
        view.mostrarMensagem("Cliente pessoa incluído com sucesso!");
    }

    private void incluirClienteEmpresa(){
        ClienteEmpresa cliente = view.capturarDadosClienteEmpresa();
        clientesEmpresas.put(cliente.getCNPJ(), cliente);
        view.mostrarMensagem("Cliente empresa incluído com sucesso!");
    }

    private void mostrarDadosClientePessoa(){
        String cpf = Prompt.lerLinha("CPF do cliente: ");
        ClientePessoa cliente = clientesPessoas.get(cpf);
        if (cliente != null){
            view.mostrarMensagem(cliente.toString());
        } else {
            view.mostrarMensagem("Cliente nao encontrado!");
        }
    }

    private void mostrarDadosClienteEmpresa(){
        String cnpj = Prompt.lerLinha("CNPJ do cliente: ");
        ClienteEmpresa cliente = clientesEmpresas.get(cnpj);
        if (cliente != null){
            view.mostrarMensagem(cliente.toString());
        } else {
            view.mostrarMensagem("Cliente nao encontrado!");
        }
    }

    private void emprestarParaClientePessoa(){
        String cpf = Prompt.lerLinha("CPF do cliente: ");
        ClientePessoa cliente = clientesPessoas.get(cpf);
        if (cliente != null){
            double valor = view.capturarValor("emprestar");
            double saldo = cliente.emprestar(valor);
            if (saldo != -1){
                view.mostrarMensagem("Empréstimo realizado com sucesso. Saldo atual: " + saldo);
            } else {
                view.mostrarMensagem("Nao foi possível realizar o empréstimo. Valor excede o limite de crédito.");
            }
        } else {
            view.mostrarMensagem("Cliente nao encontrado!");
        }
    }

    private void emprestarParaClienteEmpresa(){
        String cnpj = Prompt.lerLinha("CNPJ do cliente: ");
        ClienteEmpresa cliente = clientesEmpresas.get(cnpj);
        if (cliente != null){
            double valor = view.capturarValor("emprestar");
            double saldo = cliente.emprestar(valor);
            if (saldo != -1){
                view.mostrarMensagem("Empréstimo realizado com sucesso. Saldo atual: " + saldo);
            } else {
                view.mostrarMensagem("Nao foi possível realizar o empréstimo. Valor excede o limite de crédito.");
            }
        } else {
            view.mostrarMensagem("Cliente nao encontrado!");
        }
    }

    private void devolverParaClientePessoa(){
        String cpf = Prompt.lerLinha("CPF do cliente: ");
        ClientePessoa cliente = clientesPessoas.get(cpf);
        if (cliente != null){
            double valor = view.capturarValor("devolver");
            double saldo = cliente.devolver(valor);
            if (saldo != -1){
                view.mostrarMensagem("Devoluçao realizada com sucesso. Saldo atual: " + saldo);
            } else {
                view.mostrarMensagem("Nao foi possível realizar a devoluçao. Valor inválido.");
            }
        } else {
            view.mostrarMensagem("Cliente nao encontrado!");
        }
    }

    private void devolverParaClienteEmpresa(){
        String cnpj = Prompt.lerLinha("CNPJ do cliente: ");
        ClienteEmpresa cliente = clientesEmpresas.get(cnpj);
        if (cliente != null){
            double valor = view.capturarValor("devolver");
            double saldo = cliente.devolver(valor);
            if (saldo != -1){
                view.mostrarMensagem("Devoluçao realizada com sucesso. Saldo atual: " + saldo);
            } else {
                view.mostrarMensagem("Nao foi possível realizar a devoluçao. Valor inválido.");
            }
        } else {
            view.mostrarMensagem("Cliente nao encontrado!");
        }
    }
}