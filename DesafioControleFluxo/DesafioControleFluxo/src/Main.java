import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        double transacao1 = scanner.nextDouble();
        double transacao2 = scanner.nextDouble();
        double transacao3 = scanner.nextDouble();
        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        
        // Saldo final
        double saldoFinal = saldoInicial - transacao1 - transacao2 - transacao3;
        System.out.printf("%.3f\n", saldoFinal);

        scanner.close();
    }
}