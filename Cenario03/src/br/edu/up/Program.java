package br.edu.up;

import br.edu.up.modelos.*;

public class Program {
    public static void main(String[] args) {
        Ano ano = new Ano(2024, false);

        Compromisso compromisso = new Compromisso("João", "Café Central", "Reunião", 10);

        Mes janeiro = new Mes(31, 1);
        janeiro.adicionarCompromisso(compromisso, 1); 

        ano.adicionarMes(janeiro);

        System.out.println("Compromissos de Janeiro:");
        ano.listarCompromissos("janeiro");

        ano.excluirCompromisso("janeiro", 1, 10);
        System.out.println("\nCompromissos de Janeiro após exclusão:");
        ano.listarCompromissos("janeiro");
    }
}
