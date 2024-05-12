package br.edu.up.controllers;

import java.util.List;
import br.edu.up.models.*;
import br.edu.up.view.*;

public class Controlador {
    private IUsuario view;
    private List<Evento> eventos;
    private List<Reserva> reservas;

    public Controlador(IUsuario view, List<Evento> eventos, List<Reserva> reservas){
        this.view = view;
        this.eventos = eventos;
        this.reservas = reservas;
    }

    public void iniciar(){
        while (true) {
            view.mostrarMenu();
            String opcao = view.obterOpcao();

            switch (opcao){
                case "1":
                    Evento novoEvento = view.lerEvento();
                    eventos.add(novoEvento);
                    view.mostrarMensagem("Evento adicionado com sucesso!");
                    break;
                case "2":
                    view.mostrarEventos(eventos);
                    break;
                case "3":
                    Reserva novaReserva = view.lerReserva();
                    reservas.add(novaReserva);
                    view.mostrarMensagem("Reserva adicionada com sucesso!");
                    break;
                case "4":
                    view.mostrarReservas(reservas);
                    break;
                case "5":
                    view.mostrarMensagem("Saindo...");
                    return;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
