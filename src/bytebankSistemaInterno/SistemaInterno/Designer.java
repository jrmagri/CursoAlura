package bytebankSistemaInterno.SistemaInterno;

public class Designer extends Funcionario{

    @Override
    public double getBonificacao() {
        System.out.println("CHAMANDO O METODO DE BONIFICACAO DO DESIGNER! ");
        return  +200;
    }
}
