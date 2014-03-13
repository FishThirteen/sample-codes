package org.example.contacts.model2;

import java.util.HashMap;
import java.util.Map;

import java.lang.SuppressWarnings;

import org.example.contacts.actions.Action;
import org.example.contacts.actions.BootstrapAction;
import org.example.contacts.actions.AddContactAction;
import org.example.contacts.actions.RemoveContactAction;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ActionFactory {

  protected Map map = getDefaultMap();
  
  public Action create(String actionName) {
    Class kclass = (Class)map.get(actionName);

    if (kclass == null) {
      throw new RuntimeException(getClass() + "unable to find an action named '" 
        + actionName + "'");
    }

    Action actionInstance = null;

    try {
      actionInstance = (Action) kclass.newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return actionInstance;
  }

  protected Map getDefaultMap() {
    Map map = new HashMap();

    map.put("index", BootstrapAction.class);
    map.put("addContactAction", AddContactAction.class);
    map.put("removeContactAction", RemoveContactAction.class);

    return map;
  }

}
