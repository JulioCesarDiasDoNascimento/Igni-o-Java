package com.simpli.financial.app;

import com.simpli.financial.atm.CaixaEletronico;
import com.simpli.financial.modelo.*;
import com.simpli.financial.pagemento.Boleto;
import com.simpli.financial.pagemento.DocumentoEstonarvel;
import com.simpli.financial.pagemento.DocumentoPagavel;
import com.simpli.financial.pagemento.Holerite;

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

        minhaConta.depositar(20000.0d);
        minhaConta.sacar(100.0d, 10);
        minhaConta.creditarRendimentos(0.10d);
        minhaConta.debitarTarifa();

        Holerite salarioFuncionario = new Holerite(eu,10, 100.0f);
        Boleto boletoEscola = new Boleto(eu, 100.0d);

        caixa.pagar(boletoEscola, minhaConta);
        caixa.pagar(salarioFuncionario, minhaConta);
        caixa.estornarPagamento(boletoEscola, minhaConta);
        boletoEscola.boletoPago();
        boletoEscola.imprimirRecibo();
        salarioFuncionario.imprimirRecibo();

        caixa.imprimirSaldo(minhaConta);


//        ContaEspecial suaConta = new ContaEspecial(voce,6250,62814,1000.0d);
//        suaConta.depositar(1000.0d);
//        suaConta.sacar(1500.0);
//        suaConta.debitarTarifa();
//        caixa.imprimirSaldo(suaConta);

        // Fiz dois objetos baseado no mesmo molde(SÂO OBJETOS DIFERENTES)

    }
}
