package br.edu.up.view;

import java.util.List;
import java.util.Scanner;
import br.edu.up.models.*;

public class IUsuario {
    private Scanner scanner;

    public IUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("1 -> Adicionar evento");
        System.out.println("2 -> Listar eventos");
        System.out.println("3 -> Adicionar reserva");
        System.out.println("4 -> Listar reservas");
        System.out.println("5 -> Sair");
    }

    public Evento lerEvento() {
        System.out.print("Nome do evento: ");
        String nome = scanner.nextLine();
        System.out.print("Data do evento: ");
        String data = scanner.nextLine();
        System.out.print("Local do evento: ");
        String local = scanner.nextLine();
        System.out.print("Lotação máxima do evento: ");
        int lotacaoMaxima = Integer.parseInt(scanner.nextLine());
        System.out.print("Quantidade de ingressos vendidos: ");
        int ingressosVendidos = Integer.parseInt(scanner.nextLine());
        System.out.print("Preço do ingresso: ");
        double precoIngresso = Double.parseDouble(scanner.nextLine());
        return new Evento(nome, data, local, lotacaoMaxima, ingressosVendidos, precoIngresso);
    }

    public Reserva lerReserva() {
        System.out.print("Nome do evento da reserva: ");
        String nomeEvento = scanner.nextLine();
        System.out.print("Responsável pela reserva: ");
        String responsavel = scanner.nextLine();
        System.out.print("Quantidade de pessoas: ");
        int quantidadePessoas = Integer.parseInt(scanner.nextLine());
        System.out.print("Data da reserva: ");
        String dataReserva = scanner.nextLine();
        System.out.print("Valor total da reserva: ");
        double valorTotal = Double.parseDouble(scanner.nextLine());
        return new Reserva(nomeEvento, responsavel, quantidadePessoas, dataReserva, valorTotal);
    }

    public void mostrarEventos(List<Evento> eventos) {
        System.out.println("--- Eventos ---");
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }

    public void mostrarReservas(List<Reserva> reservas) {
        System.out.println("--- Reservas ---");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public String obterOpcao() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextLine();
    }
}
