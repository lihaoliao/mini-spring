# mini-spring日志

## IoC部分：

### 代码分支：simple-bean-container

描述：定义一个简单的bean容器BeanFactory，内部包含一个map用以保存bean，只有注册bean和获取bean两个方法

个人理解：仿照spring中的DefaultSingletonBeanRegistry类，通过Map存储bean并且完成曝光。



```java
public class BeanFactory {
    private Map<String,Object> beanObjects = new HashMap<>();

    public void registerBean(String name,Object bean){
        beanObjects.put(name,bean);
    }

    public Object getBean(String name){
        return beanObjects.get(name);
    }
}
```

测试：

```java
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
```
