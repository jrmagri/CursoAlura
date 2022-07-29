package Funcionarios;

public abstract class FuncionarioAutenticavel extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticaSenha(int senha) {
        if (this.senha == senha) {
            System.out.println("Senha correta, Bem vindo ao bytebank! ");
            return true;
        } else {
            System.out.println("SENHA INCORRETA!!!");
            return false;
        }
    }
}
