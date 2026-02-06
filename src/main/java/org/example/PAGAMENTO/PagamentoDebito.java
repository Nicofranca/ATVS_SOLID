package org.example.PAGAMENTO;

public class PagamentoDebito implements Pagamento{
    @Override
    public void formaPagamento() {
        System.out.println("Forma pagamento: Debito");
    }
}
