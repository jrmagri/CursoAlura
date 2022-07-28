package Funcionarios;

public class Gerente extends FuncionarioAutenticavel {

    public double getBonificacao(){
        System.out.println("CHAMANDO O METODO DE BONIFICACAO DO GERENTE ");
        return super.getSalario(); //super significa que o atributo está na classe mae.
    }



}
