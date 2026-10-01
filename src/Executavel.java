import java.util.Scanner;

public class Executavel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada dos dados da conta
        System.out.print("Qual o número da conta: ");
        Integer numero = sc.nextInt();

        System.out.print("Quem é o titular da conta: ");
        String titular = sc.next();

        //Pergunta simples usando números 1 ou 2
        System.out.print("Você adicionar um deposito inicial? (1-Sim / 2-Não)? ");
        int resposta = sc.nextInt();

        ContadoBanco conta;

        //Compara o número diretamente
        if (resposta == 1) {
            System.out.print("Adicione o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new ContadoBanco(numero, titular, depositoInicial);
        } else {
            conta = new ContadoBanco(numero, titular);
        }

        //Exibe dados da conta

        System.out.println("---------------------");
        System.out.println("Dados da conta:");
        System.out.println(conta);

        //Depósito
        System.out.println("---------------------");
        System.out.print("Adicione um valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println("---------------------");
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        //Saque
        System.out.println("---------------------");
        System.out.print("Adicione um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

        System.out.println("---------------------");
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        sc.close();
    }
}