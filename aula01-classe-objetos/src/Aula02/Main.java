package Aula02;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta( "Samuel", 5543, 0.00);

        minhaConta.consultarSaldo();
        minhaConta.depositar(167.000);
        minhaConta.consultarSaldo();



    }
}
