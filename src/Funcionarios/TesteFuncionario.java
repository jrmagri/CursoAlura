package Funcionarios;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario nico = new Designer();
        nico.setNome("Nico Steppat");
        nico.setCpf("422.333.455-54");
        nico.setSalario(2600.00);

        Gerente carlos = new Gerente();
        carlos.setNome("Carlos henrique");
        carlos.setCpf("245.242.324.56");
        carlos.setSalario(5000.00);
        carlos.setSenha(2540);

        boolean autenticou = carlos.autenticaSenha(240);
        System.out.println(autenticou);

        System.out.println("O salario de Carlos é de : " + carlos.getSalario());
        System.out.println("salario de : " + carlos.getSalario() + " e ganhou uma bonificação de " + carlos.getBonificacao());

        double totalSalarioMaisBonificacao = carlos.getSalario() + carlos.getBonificacao();

        System.out.println("O salario de carlos com a bonificação foi para : " + totalSalarioMaisBonificacao);


    }
}
