import com.lhl.model.User;
import com.lhl.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: lhl
 * @create: 2020/12/12
 **/
public class UserServiceTest extends BaseJunit4Test{

    @Autowired
    private IUserService userService;

    @Test
    public void testSelectUser(){
        User user=userService.selectUser(1);
        System.out.println(user);
    }
}
