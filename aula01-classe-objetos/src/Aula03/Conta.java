package Aula03;

public class Conta {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;
    private boolean status;

    public Conta(String nomeTitular, int numeroConta, double saldo){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.status = true;
    }

    public void exibir(){
        System.out.println("============== dados bancários ==============");
        System.out.println("cliente: " + getNomeTitular());
        System.out.println("Numero conta: " + getNumeroConta());
        System.out.println("Conta está ativo? " + getStatus());
        System.out.println("=============================================");
    }

        public double getSaldo(){
        return this.saldo;
    }

    private void setSaldo(double valor){
        this.saldo = valor;
    }

    public String depositar(double valor){
        setSaldo(getSaldo() - valor);
        return "deposito confirmado!";
    }

    public String sacar(double valor){
        setSaldo(getSaldo() - valor);
        return "saque realizado com sucesso!";
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }

    public String setnomeTitular(String nome){
        this.nomeTitular = nome;
        return "nome alterado com sucesso";
    }

    public boolean getStatus(){
        return this.status;
    }

    public String setStatus(boolean novoStatus){
        this.status = novoStatus;
        var resultado = getStatus()? "Conta ativada" : "Conta cancelada";
        return resultado;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public String setNumeroConta(int novoNumero){
        this.numeroConta = novoNumero;
        return "Numero da conta atualizado.";
    }




