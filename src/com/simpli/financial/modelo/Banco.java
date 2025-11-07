package com.simpli.financial.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {

    private List<Conta> contas = new ArrayList<>();

    public Banco(){
        Pessoa eu = new Pessoa("Júlio César", "118.449.555-55");
        Pessoa voce = new Pessoa("Giovanna", "987.654.321-00");

        Conta contaUM = new ContaInvestimento(eu, 1010, 12345);
        Conta contaDOIS = new ContaInvestimento(eu, 1011, 12344);
        Conta contaTRES = new ContaInvestimento(voce, 1011, 12343);
        Conta contaQUATRO = new ContaEspecial(eu, 1011, 12342, new BigDecimal(1000.0d));
        Conta contaCINCO = new ContaEspecial(eu, 1011, 12341, new BigDecimal(1000.0d));

        contaUM.depositar(new BigDecimal("120"));
        contaDOIS.depositar(new BigDecimal("150"));
        contaTRES.depositar(new BigDecimal("500"));
        contaCINCO.depositar(new BigDecimal("12000"));

        contas.add(contaUM);
        contas.add(contaDOIS);
        contas.add(contaTRES);
        contas.add(contaQUATRO);
        contas.add(contaCINCO);
    }
    public List<Conta> getContas(){
        return contas;
    }

    public Optional<Conta> buscar (int agencia, int numeroConta) {
        for (Conta conta : getContas()) {
            if (conta.getAgencia() == agencia && conta.getNumero() == numeroConta) {
                return Optional.of(conta);
            }
        }
        return Optional.empty();
    }
}
