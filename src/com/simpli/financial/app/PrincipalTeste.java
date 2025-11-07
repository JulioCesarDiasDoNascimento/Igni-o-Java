package com.simpli.financial.app;

import com.simpli.financial.modelo.Banco;
import com.simpli.financial.modelo.Conta;

import java.math.BigDecimal;


public class PrincipalTeste {

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.getContas().stream()
                .map(Conta::getSaldo)
                        .reduce(BigDecimal.ZERO, BigDecimal::add);

        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .map(conta -> conta.getTitular())
                .distinct()
                .forEach(System.out::println);

        }
    }
