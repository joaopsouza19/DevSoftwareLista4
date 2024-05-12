package br.edu.up;

import br.edu.up.models.*;
import br.edu.up.view.*;
import br.edu.up.controllers.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        IUsuario view = new IUsuario();
        List<Evento> eventos = new ArrayList<>();
        List<Reserva> reservas = new ArrayList<>();
        Controlador controlador = new Controlador(view, eventos, reservas);
        controlador.iniciar();
    }
}
