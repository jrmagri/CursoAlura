package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaque {
    public static void main(String[] args) {
        ContaCorrente carlos = new ContaCorrente("2324", "2324");
        carlos.Depositar(200);

        System.out.println(carlos.getSaldo());

        carlos.Sacar(100);

        System.out.println(carlos.getSaldo());

    }
}
