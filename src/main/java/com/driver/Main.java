package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        A Obja = new B();
        System.out.println(Obja.meth());

        B Objb = new B();
        System.out.println(Objb.meth()); // will print "Method is overridden in Extended class B"
    }
}
