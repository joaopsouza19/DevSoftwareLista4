package br.edu.up.modelos;

public class Compromisso {
    public String pessoa;
    public String local;
    public String assunto;
    public int hora;

    public Compromisso(String pessoa, String local, String assunto, int hora) {
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
        this.hora = hora;
    }
}
