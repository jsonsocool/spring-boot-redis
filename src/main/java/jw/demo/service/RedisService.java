package jw.demo.service;

import com.google.gson.Gson;
import jw.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    private final Gson gson = new Gson();

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, User> redisTemplate;

    public User write(User user) {
        stringRedisTemplate.opsForValue().set(user.getName(), gson.toJson(user));
        redisTemplate.opsForValue().set(user.getId() + "", user);
        Object obj = redisTemplate.opsForValue().get(user.getId() + "");
        return (User) obj;
    }
}
