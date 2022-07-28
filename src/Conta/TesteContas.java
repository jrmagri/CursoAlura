package Conta;

public class TesteContas {
    public static void main(String[] args) {

        ContaCorrente paula = new ContaCorrente("435", "435346-5");
        paula.Depositar(200);

        ContaPoupanca gabriel = new ContaPoupanca("356", "423424-7");
        gabriel.Depositar(100);

        //paula.Transferir(200, gabriel);
        paula.Sacar(100);
        System.out.println("SALDO PAULA: "+ paula.getSaldo());
        System.out.println("SALDO GABRIEL: "+ gabriel.getSaldo());

    }
}
