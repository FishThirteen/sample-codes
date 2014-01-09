package org.example;

public class ClientServiceImpl implements ClientService { 
  private ClientDao dao;

  @Override
  public void setClientDao(ClientDao dao) {
    this.dao = dao;
  }

  @Override
  public void run() {
    this.dao.run();
    System.out.println(ClientServiceImpl.class.toString());
  }
}

