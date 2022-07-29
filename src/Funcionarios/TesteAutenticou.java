package Funcionarios;

public class TesteAutenticou {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);


        System.out.println(g.autenticaSenha(2222));
    }
}
