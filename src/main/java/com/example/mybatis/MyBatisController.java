package com.example.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
/**
 * MyBatisController 
 *
 * @author chojeonghak@gmail.com
 * @version 1.0
 * @since 2020. 06. 02.
 */
@RestController
@Slf4j
public class MyBatisController {
	@Autowired
	UserService service;
	
    @GetMapping(path = "/users/{id}")
	public String listUsers(@PathVariable("id") int id) {
    	UserVO user = service.selectOneUser(id);
		log.info(user.toString());
		
		return user.toString();
	}
}
