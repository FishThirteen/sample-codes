package example;

import javax.annotation.PostConstruct;

public class AnotherBean implements BaseBean {
    private int number = 0;

    public AnotherBean() {
        this.number = Counter.getCounter();
    }

    @PostConstruct
    public void init() {
        System.out.println("AnotherBean init();");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println(String.format("AnotherBean %d", this.number));
    }

}
