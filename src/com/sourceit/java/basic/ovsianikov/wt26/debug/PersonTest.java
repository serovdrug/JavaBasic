package com.sourceit.java.basic.ovsianikov.wt26.debug;
import com.sourceit.java.basic.ovsianikov.wt26.debug.Person;

public class PersonTest {

    public static void main(String[] args) 
    { 
        Person p = new Person("Judy", 20); 
        System.out.println(p.getName() + " is " + p.getAge() + " years old"); 
    } 
}