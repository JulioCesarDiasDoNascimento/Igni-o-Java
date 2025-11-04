package com.simpli.financial.pagemento;

public interface DocumentoPagavel {

    double getValorTotal();
    boolean estaPago();
    void quitarPagamento();
     default void imprimirRecibo() {
         System.out.println("--- RECIBO DE PAGAMENTO ---");
         System.out.println("Valor total: " + getValorTotal());
         System.out.println("Status do pagamento: " + (estaPago() ? "Pago" : "Não pago"));
         System.out.println("---------------------------");
     }

}
