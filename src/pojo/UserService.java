package pojo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 21:18 2017/11/8
 * @Modified By:
 */
@Component("userService")//把userService加入到IOC容器中
public class UserService {
    /**
     * Resource注解会从IOC容器中找到userDAO对象并注入到当前字段
     * 这个注解相当于我们在applicationContext.xml中的：
            * <bean id="userServcie" class="pojo.UserService">
            *    <property name="userDAO" ref="userDAO"></property>
            * </bean>
            */
    @Resource//根据字段名称自动取IOC容器中找，找到后赋值
    private UserDAO userDAO;



    public void save(){
        userDAO.save();
    }
}
