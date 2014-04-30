package org.example.contacts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.example.contacts.model.Contact;
import org.example.contacts.model.ContactList;
import org.example.contacts.model.RequestParameters;

public class AddContactAction implements Action {
  public String perform(HttpServletRequest request, HttpServletResponse response) {
    Contact newContact = createContact(request);

    HttpSession session = request.getSession();
    ContactList contacts = (ContactList)session.getAttribute("contacts");
    contacts.addContact(newContact);

    session.setAttribute("contacts", contacts);
    
    return "/contacts.jsp";
  }

  public void writeToResponseStream(HttpServletResponse response, String output) {
  }

  protected Contact createContact(HttpServletRequest request) {
    Contact contact = new Contact();
    contact.setFirstname(request.getParameter(RequestParameters.FIRSTNAME));
    contact.setLastname(request.getParameter(RequestParameters.LASTNAME));
    contact.setStreet(request.getParameter(RequestParameters.STREET));
    contact.setCity(request.getParameter(RequestParameters.CITY));
    contact.setState(request.getParameter(RequestParameters.STATE));
    contact.setZip(request.getParameter(RequestParameters.ZIP));
    contact.setType(request.getParameter(RequestParameters.TYPE));

    return contact;
  }

}
