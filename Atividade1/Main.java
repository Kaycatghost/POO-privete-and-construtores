
package Atividade1;
public class Main {

    public static void main(String[] arg) {

        Pessoa p1 = new Pessoa("Milena", 19);
        Pessoa p2 = new Pessoa("Kamily", 20);

        System.out.print("Nome: " + p1.getNome("Milena"));
        System.out.print("Idade: " + p1.getIdade(19));

        System.out.print("Nome: " + p2.getNome("Kamily"));
        System.out.print("idade: " + p2.getIdade(20));

    }

}
