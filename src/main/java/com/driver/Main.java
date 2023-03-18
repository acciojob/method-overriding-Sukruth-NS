package com.driver;

public class Main {
    public static void main(String[] args) {
        A aObj = new B();
        System.out.println(aObj.meth());

        B bObj = new B();
        System.out.println(bObj.meth()); // will print "Method is overridden in Extended class B"
    }
}
