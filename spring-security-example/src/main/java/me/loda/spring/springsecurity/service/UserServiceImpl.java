package me.loda.spring.springsecurity.service;

import me.loda.spring.springsecurity.entity.User;
import me.loda.spring.springsecurity.exception.NotFoundException;
import me.loda.spring.springsecurity.model.dto.UseDto;
import me.loda.spring.springsecurity.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private  static ArrayList<User> users = new ArrayList<User>();
    static {
        users.add(new User(1,"Ha Thi Linh","linhh4599@gmail.com","0398829128","linhcute","039882"));
        users.add(new User(2,"Dinh thi B","abc@gmail.com","021357594656","helolo","123456"));
        users.add(new User(3,"Dinh thi acB","abc124@gmail.com","0123456643","meomeo","123456"));

    }

    @Override
    public List<UseDto> getListUser() {
        List<UseDto> result= new ArrayList<UseDto>();
        for (User user : users){
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public UseDto getUserById(int id) {
        for (User user : users){
            if(user.getId()==id){
                return UserMapper.toUserDto(user);
            }
        }
       throw new NotFoundException("User khong ton tai");
    }

    @Override
    public User getUserByIdPass(int id) {
        for (User user : users){
            if(user.getId()==id){
                return user;
            }
        }
        throw new NotFoundException("User khong ton tai");
    }

    @Override
    public List<UseDto> searchUser(String keyword) {
        List<UseDto> result = new ArrayList<>();
        for (User user : users){
            if (user.getName().contains(keyword)){
                result.add(UserMapper.toUserDto(user));
            }

        }
        return result;
    }

    @Override
    public ArrayList createUser(User user) {
        Integer id = users.size() + 1;
        user.setId(id);
        users.add(user);
        return users;
    }

    @Override
    public User updateUser(User newuser, int id) {
        User user = getUserByIdPass(id);
        user.setName(newuser.getName());
        user.setPhone(newuser.getPhone());
        user.setAvatar(newuser.getAvatar());
        user.setEmail(newuser.getEmail());
        user.setPassword(newuser.getPassword());
        return user;
    }

    @Override
    public boolean deleteUser(int id) {
        User user = getUserByIdPass(id);
        boolean isDelete = users.remove(user);
        return isDelete;

    }
}
