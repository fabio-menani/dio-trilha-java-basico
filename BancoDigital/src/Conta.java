public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

public Conta(){
this.agencia = Conta.AGENCIA_PADRAO;
this.numero = Conta.SEQUENCIAL++;

}

    @Override
    public void sacar(double valor){
        //saldo = saldo - valor;//(é o mesmo que o formato abaixo)
        saldo -= valor;
    }


    @Override
    public void depositar(double valor){
        //saldo = saldo + valor; //(é o mesmo que o formato abaixo)
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getAgencia() {
        return agencia;
    }


    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }
 
    protected void ImprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    } 

    
}
