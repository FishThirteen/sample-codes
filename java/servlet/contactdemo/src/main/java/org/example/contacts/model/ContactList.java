package org.example.contacts.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.lang.SuppressWarnings;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ContactList {
  private List innerList = new LinkedList();

  public List getContacts () {
    return innerList;
  }

  
  public void addContact(Contact contact) {
    innerList.add(contact);
  }
}

