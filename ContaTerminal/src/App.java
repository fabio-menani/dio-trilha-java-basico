//package br.com.dio.debbuging;

public class App { 
    public static void main(String[] args) { 
        System.out.println("Entrou no método main");
        a();
        System.out.println("Encerrou o método main");
        
           
    }
    static void a(){
        System.out.println("Iniciou o método a");
        b();
        System.out.println("Encerrou o método a");

    }

    static void b(){

        System.out.println("Iniciou o método b");
        for(int i = 0; i<=4; i++ )
        System.out.println(i);
        c();
        System.out.println("Encerrou o método b");

    }
    static void c(){
        System.out.println("Iniciou o método c");
        //Thread.dumpStack();
        System.out.println("Encerrou o método c");
    }

    }
