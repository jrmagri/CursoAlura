package Funcionarios;
//dentro de uma interface não pode ter nada concreto
//contrato autenticavel
    //quem assina essa interface, precisa implementar
        //metodo setSenha
        //metodo autentica
public abstract interface Autenticavel{

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

    }

