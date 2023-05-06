package me.loda.spring.springsecurity.model.mapper;

import me.loda.spring.springsecurity.entity.User;
import me.loda.spring.springsecurity.model.dto.UseDto;

public class UserMapper {
    public static UseDto toUserDto(User user){
        UseDto tmp = new UseDto();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setEmail(user.getEmail());
        tmp.setPhone(user.getPhone());
        tmp.setAvatar(user.getAvatar());
        return tmp;
    }
}
