package exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteApp {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite;
        double valor;
        
        ArrayList<Conta> listaDeContas = new ArrayList<>();

        ContaCorrente cc;
        ContaEspecial ce;
        ContaPoupanca cp;

        ContaPoupanca.setTaxa(0.10);

        do {
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Fazer depósito");
            System.out.println("5-Fazer saque");
            System.out.println("6-Exibir as contas");
            System.out.println("7-Sair");
            System.out.print("-->");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Criando uma conta corrente.");
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    listaDeContas.add(cc);
                    break;
                case 2:
                    System.out.println("Criando uma conta especial.");
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite:");
                    limite = teclado.nextDouble();
                    ce = new ContaEspecial(numeroConta, limite);
                    listaDeContas.add(ce);
                    break;
                case 3:
                    System.out.println("Criando uma conta poupança.");
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    cp = new ContaPoupanca(numeroConta);
                    listaDeContas.add(cp);
                    break;
                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do depósito");
                    valor = teclado.nextDouble();
                    for(Conta conta : listaDeContas){
                        if(conta.getNumero() == numeroConta){
                        conta.depositar(valor);
                        break; //interrompe o laço for quando achou a conta
                        }
                    }
                    break;
                case 5:

                    break;
                case 6:
                    for(int i =0; i < listaDeContas.size(); i++){
                        System.out.println(listaDeContas.get(i).exibir());
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 7);

        teclado.close();
    }
}
