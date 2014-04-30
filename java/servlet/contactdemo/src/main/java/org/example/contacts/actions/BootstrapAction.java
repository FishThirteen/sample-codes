package org.example.contacts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BootstrapAction implements Action {
  public String perform(HttpServletRequest request, HttpServletResponse response) {
    return "/contacts.jsp";
  }

  public void writeToResponseStream(HttpServletResponse response, String output) {
  }

}
