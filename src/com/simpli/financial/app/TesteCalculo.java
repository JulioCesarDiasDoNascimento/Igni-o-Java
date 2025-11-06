package com.simpli.financial.app;

import java.math.BigDecimal;

public class TesteCalculo {
    public static void main(String[] args) {
        BigDecimal x = BigDecimal.valueOf(1.0);
        x = x.subtract(BigDecimal.valueOf(0.10));
        x = x.subtract(BigDecimal.valueOf(0.20));
        x = x.subtract(BigDecimal.valueOf(0.30));
        System.out.println(x);
    }
}
