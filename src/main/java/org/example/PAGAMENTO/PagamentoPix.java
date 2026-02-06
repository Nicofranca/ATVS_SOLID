package org.example.PAGAMENTO;

public class PagamentoPix implements Pagamento{
    @Override
    public void formaPagamento() {
        System.out.println("Forma pagamento: Pix");
    }
}
