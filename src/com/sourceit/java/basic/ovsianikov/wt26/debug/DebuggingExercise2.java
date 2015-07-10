package com.sourceit.java.basic.ovsianikov.wt26.debug;

class DebuggingExercise2
{ 
    public static void main(String[] args) 
    { 
//        Account a = null; //bad
    	Account a = new Account("Andreii");
        a.deposit(10); 
        System.out.println(a.getOwner() + " has $" + a.getBalance()); 
    } 
}
