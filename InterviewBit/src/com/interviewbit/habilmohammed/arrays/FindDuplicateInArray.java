package com.interviewbit.habilmohammed.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class FindDuplicateInArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    final ArrayList<Integer> list = new ArrayList<Integer>();
    
    System.out.println("Enter the number of elements : ");
    int n = sc.nextInt(); 
    System.out.println("Enter the elements : ");
    for (int i=0;i<n;i++) {
      list.add(sc.nextInt());
    }
    int res = repeatedNumber(list);
    System.out.println("One of the repetition elements in the array:" + res);
  }

  private static int repeatedNumber(final ArrayList<Integer> list) {
    
    Map<Integer,Integer> repetitions = new HashMap<Integer,Integer>();
    Iterator<Integer> iterator = list.iterator();
    int rep;
    while (iterator.hasNext()) {
      int e = iterator.next();
      if (repetitions.containsKey(e)) {
        rep = repetitions.get(e);
      } else {
        rep =0;
      }
      rep++;
      repetitions.put(e, rep);
    }
    //return repetitions.
    for (Map.Entry<Integer, Integer> entry : repetitions.entrySet()) {
      int key = entry.getKey();
      int val = entry.getValue();
      if (val>1) {
        return key;
      }
    }
    return -1;
    
  }

}
