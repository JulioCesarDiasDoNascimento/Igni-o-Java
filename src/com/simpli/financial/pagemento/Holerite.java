package com.simpli.financial.pagemento;

import com.simpli.financial.modelo.Pessoa;

import java.math.BigDecimal;

public class Holerite implements DocumentoPagavel{

    private Pessoa funcionario;
    private BigDecimal valorHora;
    private int quantidadeHoras;
    private boolean pago;

    public Pessoa getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Pessoa funcionario) {
        this.funcionario = funcionario;
    }

    public BigDecimal getValorHora() {
        return valorHora;
    }

    public void setValorHora(BigDecimal valorHora) {
        this.valorHora = valorHora;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public Holerite(Pessoa funcionario, int quantidadeHoras, BigDecimal valorHora) {
        this.funcionario = funcionario;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public BigDecimal getValorTotal() {
        return valorHora.multiply(new BigDecimal(quantidadeHoras));
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }

}
