package com.driver;

// Step 1
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Step 2
class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
//        A aObj = new A();
//        System.out.println(aObj.meth());

        B bObj = new B();
        System.out.println(bObj.meth()); // will print "Method is overridden in Extended class B"
    }
}
