import cn.dengwang.pojo.User;
import cn.dengwang.service.UserService;
import cn.dengwang.service.UserServiceImpl;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void test(){
        UserServiceImpl userService=new UserServiceImpl();

        System.out.println(userService.selectUser());
    }
}
