package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.JoinPoint;
import org.springframework.context.annotation.Bean;

@Aspect
public class AppAspect {

  //@Pointcut("execution(* org.example.ExampleBean.testOne(..))")
  @Pointcut("execution(public * testOne(..))")
  public void testOnePointcut() {
    System.out.println("testConfig1");
  }

  @Pointcut("execution(* aroundOne(..)) &&  within(org.example.*)")
  public void aroundOnePointcut() {
  }

  @Before("org.example.AppAspect.testOnePointcut()")
  public int testConfig2() {
    System.out.println("testConfig2");

    return 2;
  }

  @AfterReturning(pointcut = "execution(public * aspectOne(..))", returning = "retVal")
  //@AfterReturning("org.example.AppAspect.testOnePointcut()")
  public void lastOne(Object retVal) {
    System.out.println(String.format("lastOne, %d", retVal));

  }


  @Around("org.example.AppAspect.aroundOnePointcut()")
  public void aroundOneTest(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("Before proceeding");
    Object retVal = joinPoint.proceed();
    System.out.println(String.format("After proceeding, return value is %s", retVal));
  }

}
