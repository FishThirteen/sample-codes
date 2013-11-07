package example;

public class ExampleBean {
    private AnotherBean beanOne;


    public void run() {
        System.out.println("ExampleBean");
    }

    public void SetBeanOne(AnotherBean bean) {
        this.beanOne = bean;
    }
}
