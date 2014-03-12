package org.example.contacts.model2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.contacts.actions.Action;


public class ContactsServlet extends HttpServlet {
  protected ActionFactory factory = new ActionFactory();

  public ContactsServlet() {
    super();
  }

  private String getActionName(HttpServletRequest request) {
    String path = request.getServletPath();

    return path.substring(1, path.lastIndexOf("."));

  }

  @Override
  public void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      Action action = factory.create(getActionName(request));

  }


}
