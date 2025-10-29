package com.simpli.financial.modelo;
import java.util.Objects;

public class Conta {

    private Pessoa titular; // Se chama relação tem um Ex: Conta tem um Pessoa
    private int agencia;
    private int numero;
    private double saldo;

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

    public double getSaldo() {
        return saldo;
    }


    public Conta (Pessoa titular, int agencia, int numero, double saldo) {
        Objects.requireNonNull(titular); // Isso é praticamente um if!!! Ótima pratica
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta () {}

    public void depositar(double valor){

        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        saldo += valor;
    }
    public void sacar(double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }

        if(saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente");
        } ;
        saldo -= valor;
    }

    public void sacar(double valor, double taxaSaque) {
        sacar(valor + taxaSaque);

    }
}
