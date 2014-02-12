package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

  @Bean(name="b1")
  public ExampleBean myBean() {
    return new ExampleBeanImpl();
  }

  @Bean 
  public AppAspect myAppAspect() {
    return new AppAspect();
  }
}
