package thymeleafexamples.stsm.business.entities;

public enum Type {
  PLASTIC("PLASTIC"),
  WOOD("WOOD");

  private String name;

  public static final Type[] ALL = { PLASTIC, WOOD };

  public static Type forName(String name) {
    if (name == null) {
      throw new IllegalArgumentException("Name cannot be null for type");
    }

    if (name.toUpperCase().equals("PLASTIC")) {
      return PLASTIC;
    } else if (name.toUpperCase().equals("WOOD")) {
      return WOOD;
    }

    throw new IllegalArgumentException("Name \"" + name + "\" does not correspond to any Type");
  }

  private Type(String name) {
    this.name = name; 
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return getName();
  }
}

