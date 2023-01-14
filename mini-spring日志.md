# mini-spring日志

## IoC部分：

### 代码分支：simple-bean-container

描述：定义一个简单的bean容器BeanFactory，内部包含一个map用以保存bean，只有注册bean和获取bean两个方法

个人理解：仿照spring中的DefaultSingletonBeanRegistry类，通过Map存储bean并且完成曝光。

