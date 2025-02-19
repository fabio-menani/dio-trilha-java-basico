public class Contador {
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcular o número de iterações
        int iteracoes = parametroDois - parametroUm;

        // Realizar o loop e imprimir os números
        for (int i = 1; i <= iteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}