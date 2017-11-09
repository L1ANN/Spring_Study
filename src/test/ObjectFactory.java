package test;

import domain.User;

/**
 * @Author:L1ANN
 * @Description: IOC容器创建对象的工厂类
 * @Date:Created in 20:37 2017/11/8
 * @Modified By:
 */
public class ObjectFactory {

    //实例方法创建对象
    public User getInstance(){
        return new User(100,"调用实例方法");
    }

    //静态方法创建对象
    public static User getStaticInstance(){
        return new User(100,"调用静态方法");
    }
}
