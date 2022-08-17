package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(String message){
        super(message);
    }

    public SaldoInsuficienteException(){

    }
}
