package Conta;

public abstract class Conta {

    private String agencia;
    private String numero;
    protected double saldo;
    private Cliente titular;
    private static int totalContasCriadas;

    public Conta(String Agencia, String Numero){
        Conta.totalContasCriadas++;
        //System.out.println("O total de contas criadas é : "+ totalContasCriadas);
        this.agencia = Agencia;
        this.numero = Numero;
    }


    public abstract void Depositar(double valor);

    public boolean Sacar(double valor) {

        if(this.saldo >= valor) {

            this.saldo -= valor;
            return true;
        } else {

            System.out.println("SALDO INSUFICIENTE");
            return false;

        }
    }

    public boolean Transferir(double valor, Conta destino) {

        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.Depositar(valor);
            return true;
        }

        return false;

    }

    public String getAgencia(){
        return this.agencia;
    }

    //como foi criado construtor definindo parametros obrigatorios de agencia e numero, não precisa do setter.
    public void setAgencia(String Agencia){
        this.agencia = Agencia;
    }


    public String getNumero(){
        return this.numero;
    }

    //como foi criado construtor definindo parametros obrigatorios de agencia e numero, não precisa do setter.
    public void  setNumero(String Numero){
        this.numero = Numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotalContasCriadas() {
        return totalContasCriadas;
    }
}
