package com.driver;

public class Main {
    public static void main(String[] args) {
        A Obja = new A();
        System.out.println(Obja.meth());

        B Objb = new B();
        System.out.println(Objb.meth()); // will print "Method is overridden in Extended class B"
    }
}
