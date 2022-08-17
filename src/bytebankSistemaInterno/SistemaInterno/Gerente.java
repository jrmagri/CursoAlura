package bytebankSistemaInterno.SistemaInterno;

public class Gerente extends Funcionario implements Autenticavel {

    private Autenticador autenticador;

    public Gerente(){
        this.autenticador = new Autenticador();
    }


    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }






    public double getBonificacao(){
        System.out.println("CHAMANDO O METODO DE BONIFICACAO DO GERENTE ");
        return super.getSalario(); //super significa que o atributo está na classe mae.
    }



}
