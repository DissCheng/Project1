package com.lzu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lzu.domain.User;

public interface Userdao {
    
    @Insert("insert into user(name, age) values(#{name}, #{age})")
    public void insertUser(User user);
    @Delete("delete from user where id = #{id}")
    public void deleteUser(int id);
    @Update("update user set name = #{name}, age = #{age} where id = #{id}")
    public void updateUser(int id, User user);
    @Select("select name,age from user where id = #{id}")
    public User selectUserById(int id);
    @Select("select name,age from user")
    public List<User> selectAllUsers();
}
