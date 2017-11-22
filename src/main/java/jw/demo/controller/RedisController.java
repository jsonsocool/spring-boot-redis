package jw.demo.controller;

import jw.demo.entity.User;
import jw.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/redis")
public class RedisController {


    @Autowired
    private RedisService redisService;

    @PostMapping("/string")
    public ResponseEntity<String> create() {
        User user = new User();
        user.setId(1);
        user.setAge(20);
        user.setName("hello");
        redisService.write(user);
        return ResponseEntity.ok("success");
    }
}
