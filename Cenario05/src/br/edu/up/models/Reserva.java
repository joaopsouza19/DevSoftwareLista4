package br.edu.up.models;

public class Reserva {
    private String responsavel;
    private int quantidadePessoa;
    private String dataReserva;
    private double valorTotal;

    public Reserva(String responsavel, int quantidadePessoa, String dataReserva, double valorTotal) {
        this.responsavel = responsavel;
        this.quantidadePessoa = quantidadePessoa;
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getquantidadePessoa() {
        return quantidadePessoa;
    }

    public void setquantidadePessoa(int quantidadePessoa) {
        this.quantidadePessoa = quantidadePessoa;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}

