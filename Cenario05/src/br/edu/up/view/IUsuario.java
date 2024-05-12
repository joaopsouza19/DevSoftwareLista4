package br.edu.up.view;

import java.util.List;
import java.util.Scanner;
import br.edu.up.models.*;
import br.edu.up.Prompt;

public class IUsuario {
    private Scanner scanner;

    public IUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        Prompt.imprimir("1 -> Adicionar evento");
        Prompt.imprimir("2 -> Listar eventos");
        Prompt.imprimir("3 -> Adicionar reserva");
        Prompt.imprimir("4 -> Listar reservas");
        Prompt.imprimir("5 -> Sair");
    }

    public Evento lerEvento(){
        Prompt.imprimir("Nome do evento: ");
        String nome = scanner.nextLine();
        Prompt.imprimir("Data do evento: ");
        String data = scanner.nextLine();
        Prompt.imprimir("Local do evento: ");
        String local = scanner.nextLine();
        Prompt.imprimir("Lotação máxima do evento: ");
        int lotacaoMaxima = Integer.parseInt(scanner.nextLine());
        Prompt.imprimir("Quantidade de ingressos vendidos: ");
        int ingressosVendidos = Integer.parseInt(scanner.nextLine());
        Prompt.imprimir("Preço do ingresso: ");
        double precoIngresso = Double.parseDouble(scanner.nextLine());
        return new Evento(nome, data, local, lotacaoMaxima, ingressosVendidos, precoIngresso);
    }

    public Reserva lerReserva(){
        Prompt.imprimir("Nome do evento da reserva: ");
        String nomeEvento = scanner.nextLine();
        Prompt.imprimir("Responsável pela reserva: ");
        String responsavel = scanner.nextLine();
        Prompt.imprimir("Quantidade de pessoas: ");
        int quantidadePessoas = Integer.parseInt(scanner.nextLine());
        Prompt.imprimir("Data da reserva: ");
        String dataReserva = scanner.nextLine();
        Prompt.imprimir("Valor total da reserva: ");
        double valorTotal = Double.parseDouble(scanner.nextLine());
        return new Reserva(nomeEvento, responsavel, quantidadePessoas, dataReserva, valorTotal);
    }

    public void mostrarEventos(List<Evento> eventos){
        Prompt.imprimir("--- Eventos ---");
        for (Evento evento : eventos) {
            Prompt.imprimir(evento);
        }
    }

    public void mostrarReservas(List<Reserva> reservas){
        Prompt.imprimir("--- Reservas ---");
        for (Reserva reserva : reservas) {
            Prompt.imprimir(reserva);
        }
    }

    public void mostrarMensagem(String mensagem){
        Prompt.imprimir(mensagem);
    }

    public String obterOpcao(){
        Prompt.imprimir("Escolha uma opção: ");
        return scanner.nextLine();
    }
}
