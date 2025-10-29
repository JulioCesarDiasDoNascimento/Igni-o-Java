package com.simpli.financial.modelo;

public class ContaEspecial extends Conta{

    private double valorLimite;

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }

    public ContaEspecial(Pessoa titular, int agencia, int numero, double valorLimite) {
        super(titular, agencia, numero);
        this.valorLimite = valorLimite;
    }

    @Override
    public double getSaldoDisponivel() {
        return super.getSaldoDisponivel() + getValorLimite();
    }
}
