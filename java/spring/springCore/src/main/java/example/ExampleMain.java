package example;

import org.springframework.context.*;


public class ExampleMain {
    
    public static void main(String argv[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new string [] { "example.xml" });
        ExampleBean bean = context.getBean("ExampleBean", ExampleBean.class);
        ExampleBean bean = new ExampleBean();
        YetAnotherBean bean2 = new YetAnotherBean();
        AnotherBean bean1 = new AnotherBean();
    
        bean.setBeanOne(bean1);
        bean.setBeanTwo(bean2);
    
        bean.run();
    }
}
