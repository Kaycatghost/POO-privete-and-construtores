package Questão3;
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(123, 1000.00);

        
        System.out.println("Saldo inicial: " + conta.getSaldo());
        System.out.println("Saque de 500,00: " + conta.valorSaque(500.00));
        System.out.println("Saldo após saque: " + conta.getSaldo());
        System.out.println("Saque de 200,00: " + conta.valorSaque(200.00));
        System.out.println("Saldo após saque: " + conta.getSaldo());
        System.out.println("Saque de 1500,00: " + conta.valorSaque(1500.00));
        System.out.println("Saldo após saque: " + conta.getSaldo());
    }
}