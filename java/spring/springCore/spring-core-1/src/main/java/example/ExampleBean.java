package example;

import java.util.List;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;

public class ExampleBean implements BaseBean, DisposableBean  {
    private BaseBean beanOne;
    private BaseBean beanTwo;
    private List<BaseBean> manyBeans;
        
    public void run() {
        System.out.println("ExampleBean");

        this.beanOne.run();
        this.beanTwo.run();

        for (BaseBean bean : manyBeans) {
            bean.run();
        }
    }

    public void destroy() {
        System.out.println("ExampleBean destory()");
    }

    @PostConstruct
    public void init() {
        System.out.println("ExampleBean init()");
    }

    public void setBeanOne(BaseBean bean) {
        this.beanOne = bean;
    }

    public void setBeanTwo(BaseBean bean) {
        this.beanTwo = bean; 
    }

    public void setManyBeans(List<BaseBean> beans) {
        this.manyBeans = beans;
    }
}


