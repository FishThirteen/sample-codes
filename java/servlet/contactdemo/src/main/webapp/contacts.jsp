<!DOCTYPE HTML PUBLIC "-//w3c//DTD HTML 4.01 Transitional//EN" >
<%@page import="java.util.*" %>
<%@page import="org.example.contacts.model.*" %>

<html>
  <head>
    <title>Contacts List 1.0</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >

    <style type="text/css" >
      body, table, hr {
        color : black;
        background: silver;
        font-family: Verdana, sans-serif;
        font-size: x-small;
      }
    </style>
  </head>

  <body>
   <jsp:useBean id="contacts"  scope="session" class="org.example.contacts.model.ContactList" />
   <h2>Contacts List 1.0</h2>
   <hr size="2" />

   <table frame="below" width="100%" >
    <tr>
      <th align="left" ></th>
      <th align="left" >Name</th>
      <th align="left" >Street</th>
      <th align="left" >City</th>
      <th align="left" >State</th>
      <th align="left" >Zip</th>
      <th align="left" >Type</th>
    </tr>
    <%
      List list = contacts.getContacts();
      for (Iterator i = list.iterator(); i.hasNext();) {
        Contact contact = (Contact) (i.next());
    %>
      <tr>
        <td width="100px" ><a href="removeContactAction.perform?id=<%=contact.getId()%>" >Delete</a></td>
        <td width="200px" ><%=contact.getFirstname()%> <%=contact.getLastname()%></td>
        <td width="150px" ><%=contact.getStreet()%></td>
        <td width="100px" ><%=contact.getCity()%></td>
        <td width="100px" ><%=contact.getState()%></td>
        <td width="100px" ><%=contact.getZip()%></td>
        <td width="100px" ><%=contact.getType()%></td>
      </tr>
    <%
      }
    %>
   </table>

   <br />
   <br />
   <br />

   <fieldset>
    <legend><b>Add Contact</b></legend>
    <form method="post" action="addContactAction.perform" >
      <table>
        <tr>
          <td>First Name:</td>
          <td><input type="text" size="30px" name="firstname" /></td>
        </tr>
        <tr>
          <td>Last Name:</td>
          <td><input type="text" size="30px" name="lastname" /></td>
        </tr>
        <tr>
          <td>Street:</td>
          <td><input type="text" size="30px" name="street" /></td>
        </tr>
        <tr>
          <td>City:</td>
          <td><input type="text" size="30px" name="city" /></td>
        </tr>
        <tr>
          <td>State:</td>
          <td><input type="text" size="30px" name="state" /></td>
        </tr>
        <tr>
          <td>Zip:</td>
          <td><input type="text" size="30px" name="zip" /></td>
        </tr>
        <tr>
          <td>Type:</td>
          <td>
            <input type="radio" name="type" value="family" />Family
            <input type="radio" name="type" value="acquaintance" />Acquaintance
          </td>
        </tr>
      </table>

      <br />
      <input type="submit" name="addContact" value="Add" />
    </form>
   </fieldset>
  </body>
</html>
