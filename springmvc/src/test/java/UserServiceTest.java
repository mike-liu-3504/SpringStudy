import com.lhl.model.User;
import com.lhl.service.IUserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: lhl
 * @create: 2020/12/12
 **/
public class UserServiceTest extends BaseJunit4Test {

    public static final Logger LOGGER = LoggerFactory.getLogger(UserServiceTest.class);
    @Autowired
    private IUserService userService;

    @Test
    public void testSelectUser() {
        User user = userService.selectUser(1);
        LOGGER.info(user.toString());
    }
}
