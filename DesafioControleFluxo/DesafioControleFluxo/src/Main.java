import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scanner.nextInt();

        try {
            // Chamar o método contar da classe Contador
            Contador.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Capturar e exibir a exceção personalizada
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}