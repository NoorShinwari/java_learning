package com.javaLearning;

public class SomeClass {
    // private static int classCounter = 0;
    // public final int instanceNumber;
    // private final String name;

    // public SomeClass(String name) {
    // this.name = name;
    // classCounter++;
    // instanceNumber = classCounter;
    // System.out.println(name + " created. instance is " + instanceNumber);
    // }

    // public int getInstanceNumber() {
    // return instanceNumber;
    // }

    // private static final int key = 748576362;
    // private final int encrytedPassword;

    // public SomeClass(int password) {
    // this.encrytedPassword = encryptDecrypt(password);

    // }

    // private int encryptDecrypt(int password) {
    // return password ^ key;

    // }

    // public void storePassword() {
    // System.out.println("Saving password as " + this.encrytedPassword);
    // }

    // public boolean letMeIn(int password) {
    // if (encryptDecrypt(password) == this.encrytedPassword) {
    // System.out.println("Welcome");
    // return true;
    // } else {
    // System.out.println("Nope, you cannot come in");
    // return false;
    // }
    // }

    public static final String owner;
    static {
        owner = "tim";
        System.out.println("static initialization block called");
    }

    public SomeClass() {
        System.out.println("contstructor called");
    }

    static {
        System.out.println("Second initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }

}
