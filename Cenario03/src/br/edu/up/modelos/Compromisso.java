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

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

}
