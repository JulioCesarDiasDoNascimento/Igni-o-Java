package com.simpli.financial.app;

import com.simpli.financial.modelo.*;

public class Principal {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa();
        eu.setNome("Júlio César");
        eu.setDocumento("123.456.789.00");

        Pessoa voce = new Pessoa();
        voce.setNome("Giovanna Penteado");
        voce.setDocumento("987.654.321-00");

        CaixaEletronico caixa = new CaixaEletronico();
        //Estou a criar um objeto com o molde da classe conta
        ContaInvestimento minhaConta = new ContaInvestimento(eu, 6520, 17587);

        minhaConta.depositar(1000.0d);
        minhaConta.sacar(500.0d, 10);
        minhaConta.creditarRendimentos(0.8d);
        minhaConta.debitarTarifa();
        caixa.imprimirSaldo(minhaConta);


        ContaEspecial suaConta = new ContaEspecial(voce,6250,62814,1000.0d);
        suaConta.depositar(1000.0d);
        suaConta.sacar(1500.0);
        minhaConta.debitarTarifa();
        caixa.imprimirSaldo(suaConta);

        // Fiz dois objetos baseado no mesmo molde(SÂO OBJETOS DIFERENTES)

    }
}
