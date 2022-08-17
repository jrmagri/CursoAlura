package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

    public static void main(String[] args) {
        //todas as classes herdam a classe Object
        ContaCorrente cc = new ContaCorrente("345", "323213-45");
        ContaPoupanca cp = new ContaPoupanca("348", "345717-45");

        Cliente junior = new Cliente();
        junior.setNome("Joao Paulo");

        System.out.println(cc.toString());
        System.out.println(cp.toString());

        System.out.println(junior.toString());
    }
}
