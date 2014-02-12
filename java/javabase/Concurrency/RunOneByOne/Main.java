import java.lang.Thread;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

class ThreadA extends Thread {
  public void run() {

    for (int i = 0; i < 10; i++) {
      try {
        Main.lock.lock();

        
        while (Main.flag != 0) {
          Main.condition.await();
        }
        System.out.println("A");
        Main.flag++;

        Main.condition.signalAll();
        // System.out.println(String.format("Signal All A: %d", i + 1));
      }
      catch (Exception ex) {
      }
      finally {
        Main.lock.unlock();
      }
    }
  }
}

class ThreadB extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {

      try {
        Main.lock.lock();

        while (Main.flag != 1) {
          Main.condition.await();
        }

        System.out.println("B");
        Main.flag++;

        Main.condition.signalAll();
        // System.out.println(String.format("Signal All B: %d", i + 1));

      } catch (Exception ex) {
      } finally {
        Main.lock.unlock();
      }
    }
  }
}

class ThreadC extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      try {
        Main.lock.lock();

        while (Main.flag != 2) {
          Main.condition.await();
        }

        System.out.println((i + 1));
        Main.flag = 0;

        Main.condition.signalAll();
        // System.out.println(String.format("Signal All C: %d", i + 1));

      } catch (Exception ex) {
      } finally {
        Main.lock.unlock();
      }
    }
  }
}


public class Main {

  public static ReentrantLock lock = new ReentrantLock();
  public static Condition condition = lock.newCondition();
  public static int flag = 0; 

  public static void main(String[] args) {
    ThreadA a = new ThreadA();
    ThreadB b = new ThreadB();
    ThreadC c = new ThreadC();

    a.start();
    b.start();
    c.start();

    try {
      a.join();
      b.join();
      c.join();
    }
    catch (InterruptedException ex) {

    }
  }
}

