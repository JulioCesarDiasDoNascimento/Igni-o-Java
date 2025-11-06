package com.simpli.financial.app;

import com.simpli.financial.atm.CaixaEletronico;
import com.simpli.financial.excecao.SaldoInsuficienteException;
import com.simpli.financial.modelo.*;
import com.simpli.financial.pagemento.Boleto;
import com.simpli.financial.pagemento.Holerite;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa();
        eu.setNome("Júlio César");
        eu.setDocumento("123.456.789.00");
        eu.setRendimentoAnual(new BigDecimal(100000.0d)); // AutoBoxing
        eu.setTipo(TipoPessoa.JURIDICA);
        eu.setDataUltimaAtualizacao(LocalDateTime.parse("2025-06-11T12:00:00"));
        System.out.println("Pessoa: " + eu.getNome() + " - " + " Do tipo: " + eu.getTipo());
        System.out.println(eu.getDataUltimaAtualizacao());

        Pessoa voce = new Pessoa();
        voce.setNome("Giovanna");
        voce.setDocumento("987.654.321-00");
        voce.setRendimentoAnual(new BigDecimal(100000.0d));

        CaixaEletronico caixa = new CaixaEletronico();
        //Estou a criar um objeto com o molde da classe conta
        ContaInvestimento minhaConta = new ContaInvestimento(eu, 6520, 17587);
        try {

            minhaConta.depositar(new BigDecimal(20000.0d));
            minhaConta.sacar(new BigDecimal(30000), new BigDecimal(10));
            minhaConta.creditarRendimentos(new BigDecimal(10.0));
            minhaConta.debitarTarifa();

            Holerite salarioFuncionario = new Holerite(eu, 10, new BigDecimal(100.0));
            Boleto boletoEscola = new Boleto(eu, new BigDecimal(100.0));

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
