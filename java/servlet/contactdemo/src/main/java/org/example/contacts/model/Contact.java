package org.example.contacts.model;

public class Contact {

  private static volatile int count = 0;

  private int id;
  private String firstname;
  private String lastname;
  private String street;
  private String city;
  private String state;
  private String zip;
  private String type;

  public Contact() {
    this.id = count++;
  }



  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getFirstname() {
    return this.firstname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getLastname() {
    return this.lastname;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getStreet() {
    return this.street;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCity() {
    return this.city;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return this.state;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getZip() {
    return this.zip;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
}
