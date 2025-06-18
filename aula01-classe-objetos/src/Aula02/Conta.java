package Aula02;

public class Conta {
    private String nomeTitular;
    private Integer numeroConta;
    private Double saldo;

    public Conta(String nomeTitular, Integer numeroConta, Double saldo){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void consultarSaldo(){
        System.out.printf("saldo da conta: R$ %.2f \n", this.saldo);
    }

    public void depositar(Double valor){
        this.saldo = this.saldo + valor;
    }


    public String sacar(Double valor){
        this.saldo = this.saldo - valor;
        return "saque realizado com sucesso ";
    }
}
