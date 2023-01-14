package org.springframework.beans.factory;

/**
 * @author LiHao Liao
 * @version 1.0
 * @Package_Name org.springframework.beans.factory
 * @since 1.0
 *
 * 存储Bean对象的容器
 */

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
    private Map<String,Object> beanObjects = new HashMap<>();

    public void registerBean(String name,Object bean){
        beanObjects.put(name,bean);
    }

    public Object getBean(String name){
        return beanObjects.get(name);
    }

}
