package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String Agencia, String Numero){
        super(Agencia, Numero);
    }

    public void Depositar(double valor){
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta Poupança, Numero: "+ super.toString();
    }
}
