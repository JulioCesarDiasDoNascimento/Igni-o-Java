package com.simpli.financial.modelo;

public class ContaInvestimento extends Conta{
    // É uma classe filha, é uma conta e é uma subclasse.
    // Conta é o pai.

    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public void creditarRendimentos (double percentualJuros) {
       double valorRendimentos = getSaldo() * percentualJuros / 100;
       depositar(valorRendimentos);
    }
}