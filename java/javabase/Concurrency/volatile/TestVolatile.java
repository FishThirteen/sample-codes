import java.lang.Runnable;
import java.lang.Thread;


public class TestVolatile {
  public static int a = 0;
  public static int b = 0;

  public static void main(String args[]) {
    Runnable task1 = new Runnable() {
      @Override
      public void run() {
        while(TestVolatile.b != 10) {
          //System.out.println("Thread1: a = " + Integer.toString(TestVolatile.a));
        }

        System.out.println("Thread1 End: a = " + Integer.toString(TestVolatile.a));
      }
    };

    Runnable task2 = new Runnable() {
      @Override
      public void run() {
        

      }
    };


    Thread t1 = new Thread(task1);
    t1.start();

  }

}
