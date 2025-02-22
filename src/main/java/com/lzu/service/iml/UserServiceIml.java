package com.lzu.service.iml;

import com.lzu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.lzu.domain.User;
import com.lzu.dao.Userdao;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIml implements UserService {
    private final Userdao userdao;

    @Autowired
    public UserServiceIml(Userdao userdao) {
        this.userdao = userdao;
    }

    public boolean insertUser(User user) {
        userdao.insertUser(user);
        return true;
    }

    public boolean deleteUser(int id) { 
        userdao.deleteUser(id);
        return true;
    }

    public boolean updateUser(int id, User user) {
        userdao.updateUser(id, user);
        return true;
    }

    public User selectUserById(int id) {
        return userdao.selectUserById(id);
    }

    public List<User> selectAllUsers() {
        return userdao.selectAllUsers();
    }
}
