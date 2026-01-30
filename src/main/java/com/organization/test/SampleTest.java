package com.organization.test;

public class SampleTest {

    //kind of constructor
    static {
        System.out.println("I am static");
    }

    //instance block
    {
        System.out.println("I am instance block");
    }

    //default constructor
    public SampleTest() {
        System.out.println("I am constructor");
    }

    public void method1() {
        System.out.println("Method 1");
    }

    static void main() {
        SampleTest st = new SampleTest();
        st.method1();
    }

}
