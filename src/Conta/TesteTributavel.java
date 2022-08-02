package Conta;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("345", "232424");
        cc.Depositar(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
