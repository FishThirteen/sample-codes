package example;

public class ClassA {
  public void run() {
    System.out.println(this.getClass().toString());
  }
}


class ClassB {
  public void run() {
    System.out.println(ClassB.class.toString());
  }
}
