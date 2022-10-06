package user;

public class Conta {
    
    //Atributos
    private String numeroDaConta;
    private double saldo;
    private String nomeDoCliente;

    //Construtor
    public Conta(String nomeDoCliente, String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0;
        this.nomeDoCliente = nomeDoCliente;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
        }
    }

    //Getters e Setters
    public String getNumeroDaConta() {
        return this.numeroDaConta;
    }
    
    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }
}