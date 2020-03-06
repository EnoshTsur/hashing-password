package com.example.demo;

import com.example.demo.dao.UserDAO;
import com.example.demo.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles(profiles = "dev")
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserDAO dao;

    @Test
    void contextLoads() {
    }

    @Test
    void save(){
        dao.save(new User("asdasd@asdasd", "asdasdasdas"));
    }

}
