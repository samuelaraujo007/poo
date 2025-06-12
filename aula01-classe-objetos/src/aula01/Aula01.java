package aula01;

import javax.swing.plaf.basic.BasicArrowButton;

public class Aula01 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.titulo = "Samuel";
        conta1.numero_conta = 23156;
        conta1.saldo = 0.00;
        System.out.println("Cliente: " + conta1.titulo);
        System.out.println("Numero da conta:" + conta1.numero_conta);
        System.out.println("Saldo da conta R$" + conta1.saldo);
        conta1.consultar();
        conta1.sacar();
        conta1.depositar();
        conta1.consultar();
        conta1.depositar();
        conta1.sacar();
    }
}