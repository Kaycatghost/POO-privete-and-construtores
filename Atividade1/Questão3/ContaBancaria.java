package Questão3;

public class ContaBancaria {
    int numeroConta;
    double saldo;
    
    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    double getSaldo() {
        return this.saldo;
    }
    
    int getNumeroConta() {
        return this.numeroConta;
    }
    
    void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    double valorDeposito(double valor) {
        this.saldo += valor;
        return this.saldo;
    }
    
    double valorSaque(double valor) {
        if (this.saldo < valor) {
            System.out.println("saldo insuficiente");
            return getSaldo();
        }
        this.saldo -= valor;
        return this.saldo;
    }
}


