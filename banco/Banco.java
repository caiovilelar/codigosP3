package banco;

import java.util.ArrayList;
import java.util.Scanner;
import user.*;

public class Banco {

    private ArrayList<Conta> contas;

    public Banco() {
        this.contas = new ArrayList();
    }

    private boolean contaExistente(String numeroDaConta) {
        if (getConta(numeroDaConta) == null) {
            return false;
        }
        return true;
    }

    private Conta getConta(String nConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroDaConta().equals(nConta)) {
                return conta;
            }
        }
        return null;
    }

    public void realizarDepositoEmConta(double valor, String nConta) {
        Conta conta = getConta(nConta);
        if (conta != null) {
            conta.deposito(valor);
        }
    }

    public void realizarSaqueEmConta(double valor, String nConta) {
        Conta conta = getConta(nConta);
        if (conta != null) {
            conta.saque(valor);
        }
    }

    public void realizarTransferencia(double valor, String nConta, String nDestino) {
        Conta conta = getConta(nConta);
        Conta destino = getConta(nDestino);
        if (conta != null || destino != null) {
            conta.saque(valor);
            destino.deposito(valor);
        }
    }

    public void criarConta(String numeroDaConta, String nomeDoCliente) {
        if (!contaExistente(numeroDaConta)) {
            contas.add(new Conta(numeroDaConta, nomeDoCliente));
        }
    }

    public static void exibirMenu() {
        System.out.println(" MENU BANCO BARROSO: ");
        System.out.println("---------------------");
        System.out.println("Opções");
        System.out.println("1- Criar Conta");
        System.out.println("2- Acessar Informações da Conta");
        System.out.println("3- Realizar Depósito");
        System.out.println("4- Realizar Saque");
        System.out.println("5- Realizar Transferência");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;
        String numeroDaConta = null, nomeDoCliente = null, nConta = null, nDestino = null;

        Banco bank = new Banco();
        Conta conta = new Conta(nConta, nomeDoCliente);
        Conta destino = new Conta(numeroDaConta, nomeDoCliente);

        do {
            exibirMenu();
            opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nPara criar sua conta, insira seu nome: ");
                    nomeDoCliente = in.next();

                    System.out.println("\nInsira o Número da Conta dado pelo atendente: ");
                    numeroDaConta = in.next();

                    System.out.println("Você iniciará sua conta com saldo = R$0,00. A partir da abertura da conta, você poderá realizar depositos para começar a movimentar-lá.");
                    double saldo = 0;

                    // agora vamos adicionar no arraylist pelo metodo criarConta
                    bank.criarConta(numeroDaConta, nomeDoCliente);

                    // e finalmente mostramos uma mensagem de sucesso.
                    System.out.println("\nConta criada com sucesso");
                    break;
                case 2:
                    System.out.println("\nInsira o Número da conta: ");
                    nConta = in.next();

                    // chamamos o método que pesquisa a conta
                    System.out.println(bank.getConta(nConta));

                    break;
                case 3: // vamos realizar deposito em uma conta
                    System.out.println("Insira o número da sua conta: ");
                    nConta = in.next();

                    System.out.println("Insira o valor que você gostaria de depositar na sua conta: ");
                    double valor = in.nextDouble();

                    bank.realizarDepositoEmConta(valor, nConta);

                    System.out.println("Agora seu saldo é: R$" + conta.getSaldo());
                    break;
                case 4: // vamos realizar saque em uma conta
                    System.out.println("Insira o número da sua conta: ");
                    nConta = in.next();

                    System.out.println("Insira o valor que você gostaria de retirar da sua conta: ");
                    valor = in.nextDouble();

                    bank.realizarSaqueEmConta(valor, nConta);
                    System.out.println("Agora seu saldo é: R$" + conta.getSaldo());
                    break;
                case 5: //vamos fazer transferência 
                    System.out.println("Insira o número da conta que irá transferir: ");
                    nConta = in.next();

                    System.out.println("Insira o número da conta que irá receber a transferência: ");
                    nDestino = in.next();

                    System.out.println("Insira o valor que você gostaria de transferir: ");
                    valor = in.nextDouble();

                    bank.realizarTransferencia(valor, nConta, nDestino);
                    System.out.println("Seu saldo após tranferência é: R$" + conta.getSaldo());
                    break;
                case 0:
                    System.out.println("Acesso encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }
}