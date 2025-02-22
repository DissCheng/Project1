package com.lzu.service;
import com.lzu.domain.User;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService{
    public boolean insertUser(User user);
    public boolean deleteUser(int id);
    public boolean updateUser(int id, User user);
    public User selectUserById(int id);
    public List<User> selectAllUsers();
}
