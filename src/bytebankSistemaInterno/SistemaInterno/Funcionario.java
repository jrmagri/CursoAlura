package bytebankSistemaInterno.SistemaInterno;
//não pode criar objetos dessa classe porque é abstract
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario; //poderia ter o protected, publico para os filhos, mas é melhor utilizar os metodos ja criados

    public abstract double getBonificacao(); //só implementa nas classes filhas


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
