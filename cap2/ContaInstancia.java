package cap2;

import java.util.Scanner;

public class ContaInstancia {
    public static void main(String[] args) {
        Conta c;
        c = new Conta();
        int opcao;

        Scanner resposta = new Scanner(System.in);
        System.out.print("Informe nome do titular: ");
        c.nome_titular = resposta.nextLine();
        System.out.print("Informe numero da conta: ");
        c.numero = resposta.nextInt();
        System.out.print("Agora informe o saldo: ");
        c.saldo = resposta.nextDouble();

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("=========================");
            System.out.println("Escolha uma opçao: ");
            System.out.println("0-Sair\n1-Depositar\n2-Sacar");
            System.out.println("=========================");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    depositar(c);
                    break;
                case 2:
                    sacar(c);
                default:
                    break;
            }
        } while (opcao != 0);
    }

    public static void depositar(Conta c) {
        Scanner resposta = new Scanner(System.in);
        System.out.print("Digite o valor do depósito:");
        double valor = resposta.nextDouble();

        c.depositar(valor);
        System.out.println("Saldo: " + c.saldo);
    }

    public static void sacar(Conta c) {
        Scanner resposta = new Scanner(System.in);
        System.out.print("Digite o valor do saque:");
        double valor = resposta.nextDouble();
        boolean sacou = c.sacar(valor);

        if (sacou)
            System.out.println("Saque efetuado com sucesso!");
        else
            System.out.println("Saque não efetuado");
    }
}
