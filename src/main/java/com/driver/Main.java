package com.driver;

public class Main {
  public static void main(String args[]){
     RWOnly rw1 = new RWOnly();
     System.out.println(rw1.name);
    // name has private access in RWOnly
  }
}
