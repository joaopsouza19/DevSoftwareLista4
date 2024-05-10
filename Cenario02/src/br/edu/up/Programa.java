package br.edu.up;

import br.edu.up.modelos.Ponto;
import br.edu.up.Prompt;

public class Programa {
    public static void main(String[] args) {

        Ponto ponto1 = new Ponto();

        Ponto ponto2 = new Ponto(2, 5);

        double Distancia = ponto1.calcularDistancia(ponto2);
        Prompt.imprimir("A distancia entre o ponto1 e ponto2 é: " + Distancia);

        double DistanciaPonto2 = ponto2.calcularDistancia(7, 2);
        Prompt.imprimir("A distancia entre o ponto2 a X: 7, Y:2 é: " + DistanciaPonto2);

        ponto1.setX(10);
        ponto1.setY(3);

        double novaDistancia = ponto1.calcularDistancia(ponto2);
        Prompt.imprimir("A distancia entre o ponto1 e ponto2 é: " + novaDistancia);
    }
}
