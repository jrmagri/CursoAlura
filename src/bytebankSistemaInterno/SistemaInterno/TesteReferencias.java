package bytebankSistemaInterno.SistemaInterno;

public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente(); //polimorfismo
        g1.setNome("Gabriel Henrique");
        g1.setSalario(2500.00);

        Funcionario editor = new EditorDeVideo();
        editor.setNome("Caio");
        editor.setSalario(4000.00);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(editor);
        System.out.println(controle.getSoma());


    }

}
