

public class main {
  public static void main(String args[]) {

    NewGeneric<String> s = new NewGeneric<String>();
    s.setVar("Hi, Hello, World!");

    s.print();

    s.test(String.class);
  }
}

class NewGeneric<E> {
  private E inner;

  public void print() {
    System.out.println(inner.toString());
  }

  public void setVar(E e) {
    inner = e;
  }

  public E getVar() {
    if (inner == null) {
    }

    return inner;
  }

  public <T> void test(Class<T> type) {
    T newInstance = null;
    try {
      newInstance = type.newInstance();
    } catch (InstantiationException ex) {
    } catch (IllegalAccessException ex) {
    }

    if (newInstance != null) {
      System.out.println("New Created");
    } else {
      System.out.println("It's null");
    }

  }

}



