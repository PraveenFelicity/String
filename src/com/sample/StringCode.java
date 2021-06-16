package com.sample;

public class StringCode {
public static void main(String[] args) {
	String l = "Basha";
	String l1 = "Basha";
	System.out.println("Literal String");
	System.out.println(System.identityHashCode(l));
    System.out.println(System.identityHashCode(l1));

    String s = new String ("Basha");  
    String s1 = new String ("Basha");
	System.out.println("Literal String");
	System.out.println(System.identityHashCode(s));
    System.out.println(System.identityHashCode(s1));  
    
}
}
