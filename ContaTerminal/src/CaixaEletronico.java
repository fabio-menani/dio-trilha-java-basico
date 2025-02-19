public class CaixaEletronico{
    public static void main(String[] args) {
        //System.out.println("Hello!");

        double saldo = 25;
        double saque = 24.5;

        if(saque<=saldo) {
        double novoSaldo = saldo - saque;
        System.out.println("Operação válida");
        System.out.println("Seu novo saldo é: " + novoSaldo);
        }
        else
        System.out.println("Saldo insuficiente");

    }


}