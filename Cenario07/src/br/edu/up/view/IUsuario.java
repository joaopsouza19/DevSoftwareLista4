package br.edu.up.view;

import java.util.List;
import java.util.Scanner;

import br.edu.up.Prompt;
import br.edu.up.models.Aluno;
import br.edu.up.models.Disciplina;
import br.edu.up.models.Professor;


public class IUsuario {
    private Scanner scanner;

    public IUsuario(){
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        Prompt.imprimir("Selecione uma opção:");
        Prompt.imprimir("1. Adicionar professor");
        Prompt.imprimir("2. Adicionar aluno");
        Prompt.imprimir("3. Adicionar disciplina");
        Prompt.imprimir("4. Listar professores");
        Prompt.imprimir("5. Listar alunos");
        Prompt.imprimir("6. Listar disciplinas");
        Prompt.imprimir("7. Sair");
    }

    public String lerString(String mensagem){
        Prompt.imprimir(mensagem);
        return scanner.nextLine();
    }

    public int lerInt(String mensagem){
        Prompt.imprimir(mensagem);
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarAlunos(List<Aluno> alunos) {
 
        throw new UnsupportedOperationException("Unimplemented method 'mostrarAlunos'");
    }

    public void mostrarProfessores(List<Professor> professores) {
 
        throw new UnsupportedOperationException("Unimplemented method 'mostrarProfessores'");
    }

    public void mostrarMensagem(String string) {
 
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensagem'");
    }

    public void mostrarDisciplinas(List<Disciplina> disciplinas) {
 
        throw new UnsupportedOperationException("Unimplemented method 'mostrarDisciplinas'");
    }

}