package jw.demo.service;

import jw.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceTest {

    @Autowired
    private RedisService service;

    @Test
    public void write() throws Exception {
        User user = new User();
        user.setId(1);
        user.setAge(20);
        user.setName("hello");
        User temp = service.write(user);
        Assert.notNull(null, "redis读写异常");
    }

}