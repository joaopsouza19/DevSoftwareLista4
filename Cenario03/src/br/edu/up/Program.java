package br.edu.up;

import br.edu.up.modelos.*;
import br.edu.up.Prompt;

public class Program {
    public static void main(String[] args) {
        Ano ano = new Ano(2024, false);

        Compromisso compromisso = new Compromisso("João", "Café Central", "Reunião", 10);

        Mes janeiro = new Mes(31, 1);
        janeiro.adicionarCompromisso(compromisso, 1);

        ano.adicionarMes(janeiro);

        Prompt.imprimir("Compromissos de Janeiro:");
        ano.listarCompromissos("janeiro");

        ano.excluirCompromisso("janeiro", 1, 10);
        Prompt.imprimir("\nCompromissos de Janeiro após exclusão:");
        ano.listarCompromissos("janeiro");
    }
}
