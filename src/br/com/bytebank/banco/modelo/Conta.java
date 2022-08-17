package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 *
 * @author junior magri
 */


public abstract class Conta {

    private String agencia;
    private String numero;
    protected double saldo;
    private Cliente titular;
    private static int totalContasCriadas;

    /**
     * Construtor que só inicia definindo agencia e numero da conta.
     *
     * @param Agencia
     * @param Numero
     */

    public Conta(String Agencia, String Numero) {
        Conta.totalContasCriadas++;
        //System.out.println("O total de contas criadas é : "+ totalContasCriadas);
        this.agencia = Agencia;
        this.numero = Numero;
    }


    public abstract void Depositar(double valor);

    public void Sacar(double valor) {

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);

        }

        this.saldo -= valor;

    }

    public void Transferir(double valor, Conta destino) {
        this.Sacar(valor);
        destino.Depositar(valor);

    }

    public String getAgencia() {
        return this.agencia;
    }

    //como foi criado construtor definindo parametros obrigatorios de agencia e numero, não precisa do setter.
    public void setAgencia(String Agencia) {
        this.agencia = Agencia;
    }


    public String getNumero() {
        return this.numero;
    }

    //como foi criado construtor definindo parametros obrigatorios de agencia e numero, não precisa do setter.
    public void setNumero(String Numero) {
        this.numero = Numero;
    }

    public double getSaldo() {
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

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia;
    }
}
