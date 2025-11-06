package com.simpli.financial.modelo;

import java.math.BigDecimal;
import java.util.List;

public class ContaEspecial extends Conta{

    private BigDecimal valorLimite;

    public BigDecimal getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(BigDecimal valorLimite) {
        this.valorLimite = valorLimite;
    }

    public ContaEspecial(Pessoa titular, int agencia, int numero, BigDecimal valorLimite) {
        super(titular, agencia, numero);
        this.valorLimite = valorLimite;
    }

    @Override
    public BigDecimal getSaldoDisponivel() {
        return super.getSaldoDisponivel().add(getValorLimite());
    }

    @Override
    public void debitarTarifa() {
            sacar(new BigDecimal(30));
    }
}
