public class Principal {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa();
        eu.nome = "Júlio César";
        eu.documento = "123.456.789-00";

        Pessoa voce = new Pessoa();
        voce.nome = "Giovanna Penteado";
        voce.documento = "987.654.321-00";

        //Estou criando um novo objeto com o molde da classe conta
        Conta minhaConta = new Conta(eu, 6520, 17587);

        minhaConta.saldo = 15000.0d;
        minhaConta.depositar(1000.0d);
        minhaConta.sacar(5000.0d, 10);
        System.out.println("Titular: " + minhaConta.titular.nome);
        System.out.println("Saldo: " + minhaConta.saldo);


        Conta suaConta = new Conta();
        suaConta.titular = voce;
        suaConta.agencia = 6250;
        suaConta.numero = 17853;
        suaConta.saldo = 3000.0d;
        suaConta.depositar(1000.0d);
        suaConta.sacar(4000.0d);
        System.out.println("Titular: " + suaConta.titular.nome);
        System.out.println("Saldo: " + suaConta.saldo);

        // fiz dois objetos baseado no mesmo molde(SÂO OBJETOS DIFERENTES)

    }
}
