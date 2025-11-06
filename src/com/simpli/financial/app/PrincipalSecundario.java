package com.simpli.financial.app;

import com.simpli.financial.modelo.Pessoa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrincipalSecundario {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Júlio César", "118.449.555-55");
        Pessoa voce = new Pessoa("Giovanna", "987.654.321-00");
        Pessoa amigo = new Pessoa("Thiago Ilha", "123.456.789.00");
        Pessoa gemeo = new Pessoa("Júlio César", "118.449.555-55");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(eu);
        pessoas.add(voce);
        boolean existeNaLista = pessoas.contains(amigo); // Informa se algo existe na lista
        System.out.println(existeNaLista);

        // Iteração usando diferentes tipos de loop
//        for (int i = 0; i < pessoas.size(); i++) { // for tradicional (Para trabalhar com listas o for-each é melhor)
//            System.out.println(pessoas.get(i).getNome());
//        }
//        for(Pessoa pessoa: pessoas){ // for-each (Explicação para cada objeto de pessoas é atribuído para variável pessoa)
//            System.out.println(pessoa.getNome());
//        }
//        System.out.println(eu == voce); // Compara se os objetos estão alocados no mesmo espaço da memoria
//        System.out.println(eu.equals(voce)); // Compara o conteúdo

        Set<Pessoa> unicaPessoaList = new HashSet<>();
        unicaPessoaList.add(eu);
        unicaPessoaList.add(voce);

        for (Pessoa pessoa : unicaPessoaList) {
            System.out.println(pessoa.getNome());
        }
        boolean existeNoSet = unicaPessoaList.contains(gemeo); // Nesse contexto retorna falto(tabela de espaçamento explicação no .md
        System.out.println(existeNoSet);


    }

}
