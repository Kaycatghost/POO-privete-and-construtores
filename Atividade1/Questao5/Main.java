package Questao5;

public class Main {
        public static void main(String[] args) {
        Endereco local = new Endereco("Rua dos Pinheiros", 123);
        Endereco local2 = new Endereco("Avenida Paulista", 456);
        Pessoa p1 = new Pessoa("Milena", 19);
        Pessoa p2 = new Pessoa("Kamily", 20);
        System.out.println("Nome: " + p1.getNome() + " Idade: " + p1.getIdade() + " Endereço: " + local.getRua() + ", " + local.getNumero() );
        System.out.println("Nome: " + p2.getNome() + " Idade: " + p2.getIdade() + " Endereço: " + local2.getRua() + ", " + local2.getNumero() );
    }
    
}

