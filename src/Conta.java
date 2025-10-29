import java.util.Objects;

public class Conta {

    Pessoa titular; // Se chama relação tem um Ex: Conta tem um Pessoa
    int agencia;
    int numero;
    double saldo;

    Conta (Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular); // Isso é praticamente um if!!! Ótima pratica
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    Conta () {}

    void depositar(double valor){

        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        saldo += valor;
    }
    void sacar(double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }

        if(saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente");
        } ;
        saldo -= valor;
    }

    void sacar (double valor, double taxaSaque) {
        sacar(valor + taxaSaque);

    }
}
