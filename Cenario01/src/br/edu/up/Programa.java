package br.edu.up;

import br.edu.up.modelos.Livro;

public class Programa {

    public static void main(String[] args) {

        // instanciamento do livro 1
        Livro livro1 = new Livro();
        livro1.codigo = "1598FHK";
        livro1.titulo = "Core Java 2";
        livro1.autores = "Cay S. Horstmann e Gary Cornell";
        livro1.isbn = "0130819336";
        livro1.ano = 2005;
        // instanciamento do livro 2
        Livro livro2 = new Livro();
        livro2.codigo = "9865PLO";
        livro2.titulo = "Java, Como programar";
        livro2.autores = "Harvey Deitel";
        livro2.isbn = "0130341517";
        livro2.ano = 2015;
    }
}
