package org.example.PAGAMENTO;

public class Transacao {
    public static void main(String[] args) {

        PagamentoPix pagamentoPix = new PagamentoPix();

        Caixa caixa = new Caixa(pagamentoPix);

        System.out.println(caixa);
    }
}
