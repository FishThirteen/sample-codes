package example;

public class Counter {
    private static int countNumber = 1;

    public static synchronized int getCounter() {
        return countNumber++;
    }
}
