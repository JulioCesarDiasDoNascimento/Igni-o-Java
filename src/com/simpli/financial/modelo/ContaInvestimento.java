package com.simpli.financial.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaInvestimento extends Conta{
    // É uma classe filha, é uma conta e é uma subclasse.
    // Conta é o pai.

    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public void creditarRendimentos(BigDecimal percentualJuros) {
        BigDecimal valorRendimentos = getSaldo().multiply(percentualJuros).divide(new BigDecimal(100), 2, RoundingMode.HALF_EVEN);
        // Padrão de arredondamento bancário.
        // 2.524 = 2.52 // por conta do 4 arredonda para baixo
        // 2.52(6) = 2.53 // por conta do 6 arredonda para cima
        // 2.(5)25 = 2.53 // por conta do 5 arredonda para cima
        depositar(valorRendimentos);
    }

    @Override
    public void debitarTarifa() {
        if(getSaldo().compareTo(BigDecimal.valueOf(10000.0)) < 0){
            sacar(new BigDecimal(30));
        }
    }
}