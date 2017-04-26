package com.nezha;

import com.nezha.Dao.UserMapper;
import com.nezha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nezha on 2017/4/26.
 */
@EnableTransactionManagement
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/test/{name}")
    public User findOne(@PathVariable("name")String name){
        return userMapper.findByName(name);
    }
}
