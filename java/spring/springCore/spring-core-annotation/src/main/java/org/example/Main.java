package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    // System.out.println("Hello, world!");
    
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.scan("org.example");
    ctx.refresh();

    ClientService service = ctx.getBean("cs1", ClientServiceImpl.class);

    service.run();
    
  }
}
