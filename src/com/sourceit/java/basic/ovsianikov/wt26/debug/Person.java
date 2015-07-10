package com.sourceit.java.basic.ovsianikov.wt26.debug;

class Person 
{ 
  // Instance variables 
    private String name; 
    private int age; 
  
  // Constructor 
    public Person(String _name, int _age) 
    { 
//        String name = _name; 
//        int age = _age;
    	name = _name;
    	age = _age;
    } 

  // Instance methods 
    public String getName() 
    { 
        return name; 
    } 

    public int getAge() 
    { 
        return age; 
    } 
} 
