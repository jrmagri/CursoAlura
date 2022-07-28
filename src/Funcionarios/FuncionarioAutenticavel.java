package Funcionarios;

public abstract class FuncionarioAutenticavel extends Funcionario {
    private int senha; //senha padrao para gerente

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticaSenha(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            System.out.println("SENHA INCORRETA!!!");
            return false;
        }
    }
}
