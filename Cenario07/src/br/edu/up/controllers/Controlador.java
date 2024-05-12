package br.edu.up.controllers;

import br.edu.up.view.IUsuario;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.models.*;

public class Controlador {
    private IUsuario usuario;
    private List<Professor> professores;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public Controlador(IUsuario usuario){
        this.usuario = usuario;
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void iniciar(){
        while (true) {
            usuario.mostrarMenu();
            int opcao = usuario.lerInt("Opção: ");

            switch (opcao){
                case 1:
                    adicionarProfessor();
                    break;
                case 2:
                    adicionarAluno();
                    break;
                case 3:
                    adicionarDisciplina();
                    break;
                case 4:
                    listarProfessores();
                    break;
                case 5:
                    listarAlunos();
                    break;
                case 6:
                    listarDisciplinas();
                    break;
                case 7:
                    usuario.mostrarMensagem("Saindo...");
                    return;
                default:
                    usuario.mostrarMensagem("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void adicionarProfessor(){
        String nome = usuario.lerString("Nome do professor: ");
        String rg = usuario.lerString("RG do professor: ");
        String identificacaoCurriculoLattes = usuario.lerString("Identificação do currículo Lattes: ");
      
        Professor professor = new Professor(nome, rg, identificacaoCurriculoLattes);
        professores.add(professor);
        usuario.mostrarMensagem("Professor adicionado com sucesso!");
    }

    private void adicionarAluno(){
        String nome = usuario.lerString("Nome do aluno: ");
        String rg = usuario.lerString("RG do aluno: ");
        int anoIngresso = usuario.lerInt("Ano de ingresso do aluno: ");
        String curso = usuario.lerString("Curso do aluno: ");
        String turno = usuario.lerString("Turno do aluno: ");

        Aluno aluno = new Aluno(nome, rg, anoIngresso, curso, turno);
        alunos.add(aluno);
        usuario.mostrarMensagem("Aluno adicionado com sucesso!");
    }

    private void adicionarDisciplina(){
        String nome = usuario.lerString("Nome da disciplina: ");
        int identificador = usuario.lerInt("Identificador da disciplina: ");
        String curriculo = usuario.lerString("Currículo da disciplina: ");
 
        Disciplina disciplina = new Disciplina(nome, identificador, curriculo);
        disciplinas.add(disciplina);
        usuario.mostrarMensagem("Disciplina adicionada com sucesso!");
    }

    private void listarProfessores(){
        usuario.mostrarProfessores(professores);
    }

    private void listarAlunos(){
        usuario.mostrarAlunos(alunos);
    }

    private void listarDisciplinas(){
        usuario.mostrarDisciplinas(disciplinas);
    }
}
