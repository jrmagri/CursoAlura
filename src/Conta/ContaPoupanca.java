package Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String Agencia, String Numero){
        super(Agencia, Numero);
    }

    public void Depositar(double valor){
        super.saldo += valor;
    }
}
