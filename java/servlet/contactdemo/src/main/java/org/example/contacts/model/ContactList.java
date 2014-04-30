package org.example.contacts.model;

import java.util.Collections;
import java.util.ArrayList;

import java.util.List;
import java.util.Iterator;
import java.lang.SuppressWarnings;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ContactList {
  private List innerList = new ArrayList();

  public List getContacts () {
    return innerList;
  }

  
  public void addContact(Contact contact) {
    innerList.add(contact);
  }

  public void removeContact(int contactId) {
    for (Iterator i = innerList.iterator(); i.hasNext();) {
      Contact contact = (Contact)i.next();

      if (contact.getId() == contactId) {
        i.remove();
      }
    }
  }
}

