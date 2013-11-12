package example;

public class ExampleBean {
    private AnotherBean beanOne;
    private YetAnotherBean beanTwo;


    public void run() {

        this.beanOne.run();
        this.beanTwo.run();
        System.out.println("ExampleBean");
    }

    public void SetBeanOne(AnotherBean bean) {
        this.beanOne = bean;
    }

    public void SetBeanTwo(YetAnotherBean bean) {
        this.beanTwo = bean; 
    }
}


