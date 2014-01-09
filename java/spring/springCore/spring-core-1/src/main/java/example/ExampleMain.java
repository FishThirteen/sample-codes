package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ExampleMain {
    
    public static void main(String argv[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String [] { "example.xml" });
        ExampleBean bean = context.getBean("exampleBean", ExampleBean.class);

        bean.run();
    }
}
