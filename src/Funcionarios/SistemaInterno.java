package Funcionarios;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica(FuncionarioAutenticavel fa){
        boolean autenticou = fa.autenticaSenha(senha);
        if(autenticou){
            System.out.println("Pode entrar no sistema");
        }else{
            System.out.println("Acesso negado!");
        }
    }



}
