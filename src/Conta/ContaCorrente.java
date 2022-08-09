package Conta;

public class ContaCorrente extends Conta implements Tributavel {
    //Construtores não sao herdados
    public ContaCorrente(String Agencia, String Numero){
        super(Agencia, Numero);
    }

    @Override
    public void Sacar(double valor) {
        double valorASacar = valor + 0.2;
        super.Sacar(valorASacar);
    }
    @Override
    public void Depositar(double valor){
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
