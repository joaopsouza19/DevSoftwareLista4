package br.edu.up.view;

import java.util.List;
import java.util.Scanner;

import br.edu.up.models.Aluno;
import br.edu.up.models.Disciplina;
import br.edu.up.models.Professor;

public class IUsuario {
    private Scanner scanner;

    public IUsuario(){
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        System.out.println("Selecione uma opção:");
        System.out.println("1. Adicionar professor");
        System.out.println("2. Adicionar aluno");
        System.out.println("3. Adicionar disciplina");
        System.out.println("4. Listar professores");
        System.out.println("5. Listar alunos");
        System.out.println("6. Listar disciplinas");
        System.out.println("7. Sair");
    }

    public String lerString(String mensagem){
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public int lerInt(String mensagem){
        System.out.print(mensagem);
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarMensagem(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensagem'");
    }

    public void mostrarProfessores(List<Professor> professores) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarProfessores'");
    }

    public void mostrarAlunos(List<Aluno> alunos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarAlunos'");
    }

    public void mostrarDisciplinas(List<Disciplina> disciplinas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarDisciplinas'");
    }

}