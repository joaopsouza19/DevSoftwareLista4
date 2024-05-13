package br.edu.up;

import br.edu.up.modelos.Livro;
import br.edu.up.Prompt;

public class Programa {

        public static void main(String[] args) {

                Livro livro1 = new Livro();
                livro1.setCodigo("1598FHK");
                livro1.setTitulo("Core Java 2");
                livro1.setAutores("Cay S. Horstmann e Gary Cornell");
                livro1.setIsbn("0130819336");
                livro1.setAno(2005);

                Livro livro2 = new Livro();
                livro2.setCodigo("9865PLO");
                livro2.setTitulo("Java, Como programar");
                livro2.setAutores("Harvey Deitel");
                livro2.setIsbn("0130341517");
                livro2.setAno(2015);

                Prompt.imprimir(livro1.getCodigo() + "\n" + livro1.getTitulo() + "\n" + livro1.getAutores() + "\n" + livro1.getIsbn()
                                + "\n" + livro1.getAno());
                Prompt.imprimir("\n" + livro2.getCodigo() + "\n" + livro2.getTitulo() + "\n" + livro2.getAutores() + "\n"
                                + livro2.getIsbn() + "\n" + livro2.getAno());
        }
}
// pedro