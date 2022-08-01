package SistemaInterno;

public class TesteAutenticou {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);

        Autenticavel cliente = new Cliente();
        cliente.setSenha(2345);


        System.out.println(g.autentica(2222));
        System.out.println(cliente.autentica(235));
    }
}
