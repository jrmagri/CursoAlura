package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {
        String vazio = "";
        String nome = "Alura";

        System.out.println(vazio.isEmpty());

        System.out.println(nome.length());
        System.out.println(nome.contains("Alur"));

        String outra = nome.replace("A", "a");
        System.out.println(outra);
        System.out.println(outra.charAt(2));
        int pos = outra.indexOf("ur");
        System.out.println(pos);
    }
}
