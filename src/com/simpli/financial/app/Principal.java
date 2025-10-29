package com.simpli.financial.app;

import com.simpli.financial.modelo.Conta;
import com.simpli.financial.modelo.Pessoa;

public class Principal {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa();
        eu.setNome("Júlio César");
        eu.setDocumento("123.456.789.00");

        Pessoa voce = new Pessoa();
        voce.setNome("Giovanna Penteado");
        voce.setDocumento("987.654.321-00");

        //Estou a criar um objeto com o molde da classe conta
        Conta minhaConta = new Conta(eu, 6520, 17587,15000.d);

        minhaConta.depositar(1000.0d);
        minhaConta.sacar(5000.0d, 10);
        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());


        Conta suaConta = new Conta();
        suaConta.setTitular(voce);
        suaConta.setAgencia(6250);
        suaConta.setNumero(17853);
        suaConta.depositar(1000.0d);
        suaConta.sacar(200.0d);
        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());

        // fiz dois objetos baseado no mesmo molde(SÂO OBJETOS DIFERENTES)

    }
}
