import com.lhl.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: lhl
 * @create: 2020/12/13
 **/
public class MyBatisTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory factory= (SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession session=factory.openSession();
        User user=session.selectOne("com.lhl.dao.IUserDao.selectUser",1l);
        System.out.println(user.toString());
    }
}
