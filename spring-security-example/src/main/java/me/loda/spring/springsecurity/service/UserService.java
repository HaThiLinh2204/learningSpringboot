package me.loda.spring.springsecurity.service;

import me.loda.spring.springsecurity.entity.User;
import me.loda.spring.springsecurity.model.dto.UseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface UserService {
    public List<UseDto> getListUser();
    public UseDto getUserById(int id);
    public User getUserByIdPass(int id);
    public List<UseDto> searchUser(String keyword);
    public ArrayList createUser(User user);

    public User updateUser(User newuser, int id);
    public boolean deleteUser(int id);

}
