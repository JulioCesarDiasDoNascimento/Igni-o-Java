package com.simpli.financial.app;


import com.simpli.financial.modelo.Conta;

import java.util.function.ToIntFunction;

public class NumeroContaFunction implements ToIntFunction<Conta> {
    @Override
    public int applyAsInt(Conta conta) {
        return conta.getNumero(); // FAZ PARTE DE UMA INTERFACE FUNCIONAL SAM(Single Abstract Method) * POSSO UTILIZAR LAMBDAS.
    }


}
