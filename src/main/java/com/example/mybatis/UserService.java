package com.example.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis.mapper.UserMapper;
/**
 * User 
 *
 * @author chojeonghak@gmail.com
 * @version 1.0
 * @since 2020. 06. 01.
 */
@Service
public class UserService {
	@Autowired
	private UserMapper mapper;
	
	public UserVO selectOneUser(int userId) {
		return mapper.selectOneUser(userId);
	}
}
