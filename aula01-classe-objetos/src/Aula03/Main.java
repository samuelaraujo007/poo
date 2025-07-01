package Aula03;

public class Main {
    public static void main(String[] args) {
        Conta c1  = new Conta("samuel", 2253, 0.00);

        var resposta = c1.setStatus(true);
        var saque = c1.sacar(30.00);
        System.out.println(saque);
        System.out.print(resposta);
        var valorSaldo = c1.getSaldo();
        System.out.print("Saldo da conta R$ %.2f", valorSaldo);

    }
}
