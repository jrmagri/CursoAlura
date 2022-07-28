package Conta;

public class ContaCorrente extends Conta {
    //Construtores não sao herdados
    public ContaCorrente(String Agencia, String Numero){
        super(Agencia, Numero);
    }

    @Override
    public boolean Sacar(double valor) {
        double valorASacar = valor + 0.2;
        return super.Sacar(valorASacar);
    }
    @Override
    public void Depositar(double valor){
        super.saldo += valor;
    }
}
