package Aula02;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta( "Samuel", 5543, 0.00);
        Conta myConta = new Conta("Ana Livya", 873476, 50.0);
        minhaConta.desativarConta();
        minhaConta.exibir();

        minhaConta.consultarSaldo();
        myConta.consultarSaldo();

        minhaConta.consultarSaldo();
        minhaConta.depositar(167.000);
        minhaConta.consultarSaldo();

        myConta.consultarSaldo();


    }
}
