package SistemaInterno;

public class EditorDeVideo extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("CHAMANDO O METODO DE BONIFICACAO DO EDITOR DE VIDEO");
        return +100;
    }


}
