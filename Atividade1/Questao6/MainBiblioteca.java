package Questao6;

public class MainBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(5);

        Livros livro1 = new Livros("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livros livro2 = new Livros("O Alquimista", "Paulo Coelho");
        Livros livro3 = new Livros("A Odisseia", "Homero");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println("Livros cadastrados:");
        biblioteca.mostrarLivros();
        biblioteca.emprestarLivro("O Alquimista");
        biblioteca.devolverLivro("O Alquimista");
        System.out.println("Estado atual dos livros:");
        biblioteca.mostrarLivros();
    }
}