public class Main {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("Teste " + lazy);
    }
}
