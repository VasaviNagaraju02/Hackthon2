package test2;

import java.util.LinkedList;
import java.util.Collections;


public class Q10 {
      public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Jai");
        linkedList.add("Mahesh");
        linkedList.add("Naren");
        linkedList.add("Vivek");
        linkedList.add("Vishal");
        linkedList.add("Hemant");
        System.out.println("Actual LinkedList:"+linkedList);
        Collections.shuffle(linkedList);
            System.out.println("Results after shuffle operation:" + linkedList);      
            Collections.shuffle(linkedList);
            System.out.println("Results after shuffle operation:" + linkedList);
      }
    }
