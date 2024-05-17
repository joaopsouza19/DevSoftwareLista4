package br.edu.up;

import br.edu.up.controllers.*;
import br.edu.up.view.*;

public class Programa {
    public static void main(String[] args) throws Exception {
        IUsuario view = new IUsuario();
        Controladora controller = new Controladora(view);
        controller.iniciar();
    }
}