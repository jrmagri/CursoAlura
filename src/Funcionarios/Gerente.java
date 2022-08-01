package Funcionarios;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;


    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }

    }

    public double getBonificacao(){
        System.out.println("CHAMANDO O METODO DE BONIFICACAO DO GERENTE ");
        return super.getSalario(); //super significa que o atributo está na classe mae.
    }



}
