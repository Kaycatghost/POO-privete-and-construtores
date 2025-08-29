package Questao6;

public class Livros {
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public Livros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public boolean isDisponivel() {
        return this.disponivel;
    }

    public boolean emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            return true;
        } else {
            return false;
        }
    }
}
