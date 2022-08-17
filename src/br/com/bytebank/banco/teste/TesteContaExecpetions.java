package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteContaExecpetions {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente("123", "321321");

        conta.Depositar(200);

        try {
            conta.Sacar(300);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
}
