import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar as 3 transações
        double[] transacoes = new double[3];

        // Leitura das 3 transações (como String e conversão para double)
        for (int i = 0; i < 3; i++) {
            String transacaoStr = scanner.nextLine();
            transacoes[i] = Double.parseDouble(transacaoStr);
        }

        // Leitura do valor mínimo (como String e conversão para double)
        String valorMinimoStr = scanner.nextLine();
        double valorMinimo = Double.parseDouble(valorMinimoStr);

        int contador = 0;

        // Conta as transações maiores que o valor mínimo
        for (double transacao : transacoes) {
            if (transacao > valorMinimo) {
                contador++;
            }
        }

        // Exibe o resultado
        System.out.println(contador);

        scanner.close();
    }
}