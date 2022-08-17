package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new ContaPoupanca("436", "43569-9");

        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());

        Conta conta2 = new ContaCorrente("356", "323232");

        Cliente c = new Cliente();
        c.setNome("carlos");
        c.setCpf("422.304.342-45");
        c.setProfissao("programador");



        System.out.println(conta2.getTitular());


        System.out.println(Conta.getTotalContasCriadas());
    }
}
