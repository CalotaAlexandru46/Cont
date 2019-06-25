package com.company;

public class Cont {

    private String titular;
    private String iBan;
    private double balanta;
    private double dobanda;

    public Cont(String titular, String iBan, double balanta, int dobanda) {
        this.titular = titular;
        this.iBan = iBan;
        this.balanta = balanta;
        this.dobanda = dobanda;
    }

    public double widrawal(int suma){
        return balanta=balanta-suma;
    }

    public double deposit(int suma){
        return balanta=balanta+suma;
    }

    public double adaugaDobanda(){
        return balanta=balanta+balanta*(dobanda/100);
    }

    @Override
    public String toString() {
        return titular+" are in contul "+iBan+" suma de "+balanta+" de lei.";
    }
}
