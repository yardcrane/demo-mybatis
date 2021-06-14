package com.example.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mybatis.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

@RunWith( SpringRunner.class ) //JUnit4
@SpringBootTest
@Slf4j
public class UserTest {
     @Autowired
    private UserMapper mapper;

    @Test
    public void userTest() {
    	UserVO user1 = mapper.selectOneUser(1);
    	
	    UserVO user = new UserVO();
	    user.setUserNickname("myNickName");
	    user.setUserName("myName");
	    mapper.insertUser(user);
	      
	  	log.info("inserted!");
    }
}
