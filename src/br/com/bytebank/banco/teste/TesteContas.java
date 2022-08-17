package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) {

        ContaCorrente paula = new ContaCorrente("435", "435346-5");
        paula.Depositar(500);

        ContaPoupanca gabriel = new ContaPoupanca("356", "423424-7");
        gabriel.Depositar(100);

        paula.Transferir(200, gabriel);
        paula.Sacar(600);
        System.out.println("SALDO PAULA: "+ paula.getSaldo());
        System.out.println("SALDO GABRIEL: "+ gabriel.getSaldo());

    }
}
