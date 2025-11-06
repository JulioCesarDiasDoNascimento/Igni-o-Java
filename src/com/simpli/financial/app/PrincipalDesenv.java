package com.simpli.financial.app;

import com.simpli.financial.modelo.Banco;
import com.simpli.financial.modelo.Conta;

import java.util.Comparator;
import java.util.function.ToIntFunction;

public class PrincipalDesenv {

    public static void main(String[] args) {
        Banco banco = new Banco();
//   ToIntFunction<Conta> function = (Conta conta) -> conta.getNumero();  // Evita toda aquela classe criada.
//   banco.getContas().sort(Comparator.comparingInt((function)); Dessa forma não ta boa.
//   banco.getContas().sort(Comparator.comparingInt((Conta conta) -> conta.getNumero())); // Pode ficar menor ainda
    banco.getContas().sort(Comparator.comparingInt(Conta::getNumero)); // Pode ficar menor ainda

        for (Conta conta : banco.getContas()) {
            System.out.println("Agencia: " + conta.getAgencia() + " - Numero: " + conta.getNumero());
        }
    }
}
