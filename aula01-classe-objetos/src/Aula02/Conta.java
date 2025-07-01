package Aula02;

public class Conta {
    private String nomeTitular;
    private Integer numeroConta;
    private Double saldo;
    private Boolean contaAtiva;

    public Conta(String nomeTitular, Integer numeroConta, Double saldo){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.contaAtiva = true;
    }

    public void exibir(){
        System.out.println("======== Cliente========");
        System.out.println("Nome: " + this.nomeTitular);
        System.out.println("Nome da conta: " + this.numeroConta);
        System.out.println("Conta está ativa? " + this.contaAtiva);
        System.out.println("========================");
    }

    public void ativarConta(){
        this.contaAtiva=true;
    }

    public void desativarConta(){
        this.contaAtiva = false;
    }

    public void consultarSaldo(){
        if (this.contaAtiva){
            System.out.printf("Saldo da conta: R$%.2f \n", this.saldo);
        }
    }

    public void depositar(Double valor){
        this.saldo = this.saldo + valor;
    }


    public String sacar(Double valor){
        this.saldo = this.saldo - valor;
        return "saque realizado com sucesso ";
    }
}
