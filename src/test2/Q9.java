package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

 

public class Q9 {
      public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Jai");
        list.add("Mahesh");
        list.add("Naren");
        list.add("Vivek");
        list.add("Vishal");
        list.add("Hemant");
        System.out.println("Actual LinkedList:"+list);
        List<String> list1 = new ArrayList<String>(list);
           
            System.out.println("Results after toarray operation:" + list1);
      }
    }