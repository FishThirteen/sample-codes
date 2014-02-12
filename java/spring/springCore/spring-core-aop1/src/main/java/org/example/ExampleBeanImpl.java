package org.example;

public class ExampleBeanImpl implements ExampleBean {
  @Override
  public void testOne() {
    System.out.println("ExampleBeanImpl.testOne()");
  }

  @Override
  public int aspectOne() {
    System.out.println("ExampleBeanImpl.aspectOne()");
    return 111111;
  }


  @Override
  public String aroundOne() {
    System.out.println("ExampleBeanImpl.aroundOne()");

    return "Return by ExampleBeanImpl.aroundOne()";
  }

  @Override
  public void acquireFile(Account account, String fileName) {
    System.out.println("ExampleBeanImpl.acquireFile()");
  }
}
