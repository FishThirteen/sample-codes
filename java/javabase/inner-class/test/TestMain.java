package test;

import example.ClassA;

public class TestMain {
  public static void main(String[] args) {
    TestMain tMain = new TestMain();
    tMain.run();

    ClassA a = new ClassA();
    a.run();

    try
    {
      Class<?> b = Class.forName("example.ClassB");
      System.out.println(b.toString());

      try
      {
        Object classB = b.newInstance();
        System.out.println("new B");
      }
      catch (Exception e) {
        System.out.println(e.getMessage());
      }
      
    }
    catch (ClassNotFoundException e){
      System.out.println(e.getMessage());
    }

  }

  public void run() {
    System.out.println(this.getClass().toString());
  }
}
