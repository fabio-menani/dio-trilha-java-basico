import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o saldo inicial
        System.out.print("Digite o saldo inicial da conta: ");
        String saldo = scanner.nextLine();

        // Solicita e lê as três transações
        System.out.print("Digite o valor da primeira transação: ");
        String transacao1 = scanner.nextLine();

        System.out.print("Digite o valor da segunda transação: ");
        String transacao2 = scanner.nextLine();

        System.out.print("Digite o valor da terceira transação: ");
        String transacao3 = scanner.nextLine();

        // Fecha o scanner, pois não precisamos mais dele
        scanner.close();

        double NewTransacao1 = Double.parseDouble(transacao1);
        double NewTransacao2 = Double.parseDouble(transacao2);
        double NewTransacao3 = Double.parseDouble(transacao3);

        double saldoNew = Double.parseDouble(saldo);
        // Atualiza o saldo com as transações
        saldoNew += NewTransacao1;
        saldoNew += NewTransacao2;
        saldoNew += NewTransacao3;

        // Exibe o saldo final
        System.out.printf("O saldo final da conta é: %.2f%n", saldoNew);
    }
}