package bytebankSistemaInterno.SistemaInterno;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f){
        double bonificacao = f.getBonificacao();

        this.soma = soma + bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
