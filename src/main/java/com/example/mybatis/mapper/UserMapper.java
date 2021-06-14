package com.example.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatis.UserVO;
/**
 * UserMapper 
 *
 * @author chojeonghak@gmail.com
 * @version 1.0
 * @since 2020. 06. 01.
 */
@Mapper
public interface UserMapper {
    public void insertUser (UserVO user);
    public void updateUser (UserVO user);
    public void deleteUser (int userId);
    public UserVO selectOneUser (int userId);
    public List<UserVO> selectAllUser();
    public List<Map<String, Object>> selectTables();
}
