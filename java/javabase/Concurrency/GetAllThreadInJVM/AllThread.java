import java.util.*;

public class AllThread {
    public static void main(String argv[]) {
        Set<Thread> allThreads = Thread.getAllStackTraces().keySet();

        for (Thread t : allThreads) {
            System.out.printf("Id: %d, Name: %s \n", t.getId(), t.getName());

        }

    }
}
