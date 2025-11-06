package com.simpli.financial.modelo;
import com.simpli.financial.modelo.excecao.SaldoInsuficienteException;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Conta {
    // Deixando como um molde
    // Não é mais possível criar uma instância dessa classe

    private Pessoa titular; // Se chama relação tem um Ex: Conta tem um Pessoa
    private int agencia;
    private int numero;
    private BigDecimal saldo = BigDecimal.ZERO;

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }


    public Conta (Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular); // Isso é praticamente um if!!! Ótima pratica
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta () {}

    public void depositar(BigDecimal valor){

        if(valor.compareTo(BigDecimal.ZERO) <=0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        saldo = saldo.add(valor);
    }
    public void sacar(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }

        if(getSaldoDisponivel().subtract(valor).compareTo(BigDecimal.ZERO) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo = saldo.subtract(valor);
    }

    public void sacar(BigDecimal valor, BigDecimal taxaSaque) {
        sacar(valor.add(taxaSaque));

    }

    public BigDecimal getSaldoDisponivel() {
        return getSaldo();
    }
    public abstract void debitarTarifa();
}
