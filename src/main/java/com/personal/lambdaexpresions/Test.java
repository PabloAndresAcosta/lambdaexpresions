package com.personal.lambdaexpresions;

public class Test {
  private A a;

  public static void main(String[] args) {
    Test aTest = new Test();
    aTest.addA(
        (p1,p2) -> {
          System.out.println(p1.toString());
          System.out.println(p2.toString());
        }
    );
    aTest.a.m("A", "B");
    
    Test bTest = new Test();
    bTest.addA(
        (p1,p2) -> System.out.println(Integer.valueOf(p1.toString())+Integer.valueOf(p2.toString()))
    );
    bTest.a.m("7", "9");
    
  }
  
  public void addA(A a){
    this.a = a;
  }

}