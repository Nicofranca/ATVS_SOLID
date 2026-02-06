package org.example.PAGAMENTO;

public class Caixa {

    Pagamento pagamento;

    public Caixa(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void fecharVenda(){
        pagamento.formaPagamento();
    }
}
