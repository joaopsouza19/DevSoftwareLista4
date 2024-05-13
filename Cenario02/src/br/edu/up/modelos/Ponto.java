package br.edu.up.modelos;

public class Ponto {
    private double x;
    private double y;

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public Ponto(){
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(double x, double y){
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }

    public double calcularDistancia(Ponto p){
        return calcularDistancia(p.getX(), p.getY());
    }

}
