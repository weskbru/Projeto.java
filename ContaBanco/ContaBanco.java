package ContaBanco;

public class ContaBanco {
    public static void main(String[] arhg) {

        /*
         * criando um novo objeto com os mesmo atributos do objeto Conta, 
         * e com atributos diferente
         */

        Conta p1 = new Conta();
        p1.setNumConta(1515);
        p1.abrirConta("cp");
        p1.setDono("wesley");
        p1.deposita(500);
    //  p1.saca(700);   -> irá gera um erro pois o valor de saque especificado é superior ao valor que tem na conta

        p1.estadoAtual();
    }
}
