package com.simpli.financial.app;

import com.simpli.financial.modelo.Banco;
import com.simpli.financial.modelo.Conta;

import java.util.Optional;

public class PrincipalFIM {
    public static void main(String[] args) {

        Banco banco = new Banco();

      // Optional<Conta> contaOptional = banco.buscar(1010, 12345);
      // contaOptional.ifPresent(conta -> System.out.println("Conta encontrada: " + conta.getNumero()));
      // Conta conta = banco.buscar(1010, 12345).orElseThrow(() -> new RuntimeException("Conta não encontrada"));


    }



}
