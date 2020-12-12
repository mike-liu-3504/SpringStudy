import com.lhl.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description: spring单元测试基类
 * @author: lhl
 * @create: 2020/12/12
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@ComponentScan(value = "com.lhl")
@Transactional
public class BaseJunit4Test extends AbstractJUnit4SpringContextTests {

    @Test
    public void test(){
        //随便瞎写的，测试通过了
        IUserService controller = applicationContext.getBean(IUserService.class);
        System.out.println(controller);
    }
}
