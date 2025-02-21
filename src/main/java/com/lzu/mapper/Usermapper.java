package com.lzu.mapper;
import com.lzu.pojo.User;
import java.util.List;


public interface Usermapper {
    public void insertUser(String name, int age);
    public void deleteUser(int id);
    public void updateUser(int id, String name, int age);
    public User getUserById(int id);
    public List<User> selectAllUsers();
}
