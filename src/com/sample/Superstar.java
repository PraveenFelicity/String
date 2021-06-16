package com.sample;

public class Superstar {
   public static void main(String[] args) {
    String s = "Rajinikanth%1950%SuperStar";

   int l= s.length();
   System.out.println(l);
   char c= s.charAt(7);
   System.out.println(c);
   int it= s.indexOf("k");
   System.out.println(it);
   int k =s.lastIndexOf("t");
   System.out.println(k);
   String a = s.toUpperCase();
   System.out.println(a);
   String b = s.toLowerCase();
   System.out.println(b);
   Boolean d = s.startsWith("R");
   System.out.println(d);
   Boolean e =s.endsWith("t");
   System.out.println(e);
   Boolean f =s.equals("Rajinikanth");
   System.out.println(f);
   Boolean  g =s.equalsIgnoreCase("rajinikanth");
   System.out.println(g);
   boolean h = s.contains("b");
   System.out.println(h);
   String o =s.replace("a","&");
   System.out.println(o);
   Boolean q =s.isEmpty();
   System.out.println(q);
   String r= s.substring(10);
   System.out.println(r);
   String [] ot = s.split("%");
   System.out.println(ot[2]);
   String z =s.concat(" from 1975");
   System.out.println(z);
     }
}
