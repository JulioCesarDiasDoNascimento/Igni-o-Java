package com.simpli.financial.pagemento;

import com.simpli.financial.modelo.Pessoa;

public class Boleto implements DocumentoPagavel, DocumentoEstonarvel{


    private Pessoa beneficiario;
    private double valor;
    private boolean pago;

    public Boleto(Pessoa beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
    }

    public Pessoa getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Pessoa beneficiario) {
        this.beneficiario = beneficiario;
    }

    @Override
    public double getValorTotal() {
        return valor;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void estornarPagamento() {
        pago = false;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }

    public void boletoPago() {
        if (estaPago()) {
            System.out.println("Boleto pago: " + estaPago());
        }
    }
}
