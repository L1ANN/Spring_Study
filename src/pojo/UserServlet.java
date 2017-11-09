package pojo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 22:29 2017/11/8
 * @Modified By:
 */
@Component
public class UserServlet {
    @Resource
    private UserService userService;

    public void execute(){
        userService.save();
    }
}
