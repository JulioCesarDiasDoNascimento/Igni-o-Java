public class Principal {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa();
        eu.nome = "Júlio César";
        eu.documento = "123.456.789-00";

        Pessoa voce = new Pessoa();
        voce.nome = "Giovanna Penteado";
        voce.documento = "987.654.321-00";

        //Estou criando um novo objeto com o molde da classe conta
        Conta minhaConta = new Conta();
        minhaConta.titular = eu; // sempre lembrar que titular agora é um objeto da classe pessoa e precisa ser instanciado.
        minhaConta.agencia = 6250;
        minhaConta.numero = 17854;
        minhaConta.saldo = 15000.0d;
        System.out.println("Titular: " + minhaConta.titular.nome);


        Conta suaConta = new Conta();
        suaConta.titular = voce;
        suaConta.agencia = 6250;
        suaConta.numero = 17853;
        suaConta.saldo = 3000.0d;
        System.out.println("Titular: " + suaConta.titular.nome);

        // fiz dois objetos baseado no mesmo molde(SÂO OBJETOS DIFERENTES)

    }
}
