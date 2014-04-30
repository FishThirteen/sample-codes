package org.example.contacts.actions;

import org.example.contacts.model.Contact;
import org.example.contacts.model.ContactList;
import org.example.contacts.model.RequestParameters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RemoveContactAction implements Action {
  public String perform(HttpServletRequest request, HttpServletResponse response) {
    int contactId = Integer.parseInt(request.getParameter(RequestParameters.ID));

    HttpSession session = request.getSession();
    ContactList contacts = (ContactList) session.getAttribute("contacts");
    contacts.removeContact(contactId);

    session.setAttribute("contacts", contacts);

    return "/contacts.jsp";
  }

  public void writeToResponseStream(HttpServletResponse response, String output) {
  }

}
