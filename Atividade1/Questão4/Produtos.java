package Questão4;

public class Produtos {
    private String nome;
    private double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        if (preco < 0) {
            System.out.println("Preço inválido!");
            return 0;
        } else {
            return preco;
        }
    
    }
    
}
