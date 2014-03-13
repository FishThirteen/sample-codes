package org.example.contacts.model;

public class Contact {
  private String firstname;
  private String lastname;
  private String street;
  private String city;
  private String state;
  private String zip;
  private String type;


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public void setType(String type) {
    this.type = type;
  }
}
