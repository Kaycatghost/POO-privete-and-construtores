package Questao6;

public class Biblioteca {
    private Livros[] livros;
    private int contador;

    public Biblioteca(int tamanho) {
        livros = new Livros[tamanho]; // Corrigido!
        contador = 0;
    }

    public void adicionarLivro(Livros livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro adicionado com sucesso!");
        } else {
            System.out.println("Não há espaço para adicionar mais livros.");
        }
    }

    public void emprestarLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equals(titulo)) {
                if (livros[i].isDisponivel()) {
                    livros[i].emprestar();
                    System.out.println("Livro emprestado com sucesso!");
                } else {
                    System.out.println("Livro já está emprestado.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equals(titulo)) {
                if (!livros[i].isDisponivel()) {
                    livros[i].devolver();
                    System.out.println("Livro devolvido com sucesso!");
                } else {
                    System.out.println("Livro não está emprestado.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void mostrarLivros() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Título: " + livros[i].getTitulo());
            System.out.println("Autor: " + livros[i].getAutor());
            System.out.println("Disponibilidade: " + (livros[i].isDisponivel() ? "Disponível" : "Empréstado"));
            System.out.println();
        }
    }
}