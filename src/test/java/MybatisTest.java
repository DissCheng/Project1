
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lzu.config.SpringConfig;
import com.lzu.service.UserService; 
import com.lzu.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringConfig.class)
public class MybatisTest {
    @Autowired
    private UserService userService;
    @Test
    public void TestInsertUser() {
        User user = new User("Tom", 25);
        boolean result = userService.insertUser(user);
        System.out.println(result);
        System.out.println(userService.selectUserById(1));
    }
}