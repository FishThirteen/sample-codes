package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {

  @Bean(name= "cs1")
  public ClientService clientService() {
    ClientServiceImpl service = new ClientServiceImpl();

    service.setClientDao(clientDao());

    return service;
  }


  @Bean (name = "cs2")
  public ClientService clientService2() {
    ClientServiceImpl service = new ClientServiceImpl();

    service.setClientDao(clientDao());

    return service;
  }


  @Bean
  public ClientDao clientDao() {
    return new ClientDaoImpl();
  }

}
