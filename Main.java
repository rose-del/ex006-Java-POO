import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContaCorrente titular1 = new ContaCorrente(1, 250.0, "Fulano");
        ContaCorrente titular2 = new ContaCorrente(2, 5000.0, "Sicrano");
        ContaCorrente titular3 = new ContaCorrente(3, 18000.000, "Rose");
        ContaCorrente titular4 = new ContaCorrente(4, 30000.00, "Maria");

        try (Scanner input = new Scanner(System.in)) {

            int opcao = 0;
            while (opcao != 4) {
                System.out.println("Qual operação você deseja realizar: ");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Ver saldo");
                System.out.println("4 - Sair");

                opcao = input.nextInt();

                if (opcao == 1) {
                    System.out.println("Digite o valor para depositar: ");
                    Double deposito = input.nextDouble();

                    titular1.depositar(deposito);

                    System.out.println("Valor depositado.");
                } else if (opcao == 2) {
                    System.out.println("Digite o valor para sacar: ");
                    Double saque = input.nextDouble();

                    titular1.sacar(saque);
                } else if (opcao == 3) {
                    System.out.println("Saldo Total: " + titular1.saldo);
                } else {
                    break;
                }
                System.out.println();
            }
        }

        System.out.println(titular1);
        System.out.println(titular2);
        System.out.println(titular3);
        System.out.println(titular4);
    }
}
