package Conta;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(String message){
        super(message);
    }

    public SaldoInsuficienteException(){

    }
}
