package test;

import domain.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import pojo.UserServlet;


/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 12:36 2017/11/8
 * @Modified By:
 */
public class Demo1 {
     ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    /**
     * 通过工厂类获取的IOC容器来创建User对象
     */
    @Test
    public void testIOC(){
        //User user = new User();
        //System.out.println(user);

        //1.将对象的创建交给Spring的IOC容器
        Resource resource = new ClassPathResource("applicationContext.xml");
        //2.创建容器工厂（即bean的工厂），IOC容器=工厂类+applicationContext.xml
        BeanFactory factory = new XmlBeanFactory(resource);
        //3.得到容器创建的对象，需要传入的参数为我们在配置文件中写入的<bean>标签的id
        User user = (User)factory.getBean("user");
        //4.输出
        System.out.println(user);
    }

    /**
     * 直接得到IOC容器的对象
     */
    @Test
    public void testIOC2(){

        //从容器获取bean
        User user1 = (User)ac.getBean("user2");
        User user2 = (User)ac.getBean("user3");
        System.out.println(user1.hashCode());
        System.out.println(user1);
        System.out.println(user2.hashCode());
        System.out.println(user2);

    }

    @Test
    public void testIOC3(){
        User user3 = (User)ac.getBean("user7");
        System.out.println(user3);
    }

    @Test
    public void testIOC4(){
        UserServlet userServlet=(UserServlet)ac.getBean("userServlet");
        userServlet.execute();
    }
}
