package org.springframework.test.beans.factory;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

import static org.junit.Assert.assertThat;

/**
 * @author LiHao Liao
 * @version 1.0
 * @Package_Name org.springframework.test.beans.factory
 * @since 1.0
 */
public class SimpleBeanContainerTest {

    @Test
    public void testGetBean() throws Exception {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        Assert.assertNotNull(helloService);
        Assert.assertEquals("hello",helloService.sayHello());
    }

    class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}
