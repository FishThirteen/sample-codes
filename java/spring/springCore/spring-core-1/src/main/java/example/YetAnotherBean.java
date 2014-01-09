package example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class YetAnotherBean implements BaseBean, InitializingBean, DisposableBean {
    public YetAnotherBean() {
        this.number = Counter.getCounter();
    }

    private int number = 0;

    @Override
    public void afterPropertiesSet() {
        System.out.println(String.format("YetAnotherBean %d init()", this.number));
    }

    @Override
    public void destroy() {
        System.out.println(String.format("YetAnotherBean %d destroy()", this.number));
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println(String.format("YetAnotherBean %d", this.number));

    }
}
