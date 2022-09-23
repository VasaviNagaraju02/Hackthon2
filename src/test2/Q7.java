package test2;

import java.util.*;
public class Q7 {
   public static void main(String args[]){
      LinkedList<String> l1 = new LinkedList<String>();
      l1.add("Java");
      l1.add("Scalaa");
      l1.add("C++");
      System.out.println("The list is defined as: " +l1);
      l1.addFirst("JVA");
      l1.addLast("Spark");
      System.out.println("The list after adding elements is: " + l1);
   }
}
