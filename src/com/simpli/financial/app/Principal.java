package com.simpli.financial.app;

import com.simpli.financial.atm.CaixaEletronico;
import com.simpli.financial.excecao.SaldoInsuficienteException;
import com.simpli.financial.modelo.*;
import com.simpli.financial.pagemento.Boleto;
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
        try {


            minhaConta.depositar(20000.0d);
            minhaConta.sacar(30000.0d, 10);
            minhaConta.creditarRendimentos(0.10d);
            minhaConta.debitarTarifa();

            Holerite salarioFuncionario = new Holerite(eu, 10, 100.0f);
            Boleto boletoEscola = new Boleto(eu, 100.0d);

            caixa.pagar(boletoEscola, minhaConta);
            caixa.pagar(salarioFuncionario, minhaConta);
            caixa.estornarPagamento(boletoEscola, minhaConta);
            boletoEscola.boletoPago();
            boletoEscola.imprimirRecibo();
            salarioFuncionario.imprimirRecibo();
        }catch (SaldoInsuficienteException e){
            System.out.println("Erro ao executar operação na conta: " + e.getMessage());
        }
        caixa.imprimirSaldo(minhaConta);
    }
}
