package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String args[]) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.scan("org.example");
    ctx.refresh();

    ExampleBean bean = ctx.getBean("b1", ExampleBean.class);

    bean.testOne();
    System.out.println("**********");
    bean.aspectOne();
    System.out.println("**********");
    bean.aroundOne();
  }
}
