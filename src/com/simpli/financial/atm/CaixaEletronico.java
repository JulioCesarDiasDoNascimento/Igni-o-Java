package com.simpli.financial.atm;

import com.simpli.financial.modelo.Conta;
import com.simpli.financial.pagemento.DocumentoEstonarvel;
import com.simpli.financial.pagemento.DocumentoPagavel;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta){
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome() + " - " + conta.getTitular().getDocumento());
        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Saldo disponive: " + conta.getSaldoDisponivel());
    }

    public void pagar(DocumentoPagavel documento, Conta conta){
        if(documento.estaPago()){
            throw new IllegalStateException("Já está pago!");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }

    public void estornarPagamento(DocumentoEstonarvel documento, Conta conta){
        if (!documento.estaPago()){
            throw new IllegalStateException("Documento não está pago!");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }

}
