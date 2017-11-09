package pojo;

import org.springframework.stereotype.Component;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 21:18 2017/11/8
 * @Modified By:
 */
//把当前对象加入到IOC容器中
@Component//加入到IOC容器中UserDAO对象的引用名称，默认与类名一样，且首字母小写
public class UserDAO {
    public void save() {
        System.out.println("保存用户信息到数据库中");
    }
}
