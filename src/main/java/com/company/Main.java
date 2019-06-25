package com.company;

public class Main {
    public static void main(String[] args) {
        Cont cont1=new Cont("Mihai","1231_1234_1234_1444",300, 12 );
        Cont cont2=new Cont("Paul","1231_1234_1234_1241", 500, 10);

        cont1.widrawal(100);
        System.out.println(cont1.toString());

        cont1.deposit(200);
        System.out.println(cont1.toString());

        cont2.adaugaDobanda();
        System.out.println(cont2.toString());
    }
}
