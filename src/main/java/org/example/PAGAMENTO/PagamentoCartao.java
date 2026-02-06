package org.example.PAGAMENTO;

public class PagamentoCartao implements Pagamento{
    @Override
    public void formaPagamento() {
        System.out.println("Forma pagamento: Cartao");
    }
}
