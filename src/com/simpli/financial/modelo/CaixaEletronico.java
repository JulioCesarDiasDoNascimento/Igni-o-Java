package com.simpli.financial.modelo;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta){
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Saldo disponive: " + conta.getSaldoDisponivel());
    }

}
