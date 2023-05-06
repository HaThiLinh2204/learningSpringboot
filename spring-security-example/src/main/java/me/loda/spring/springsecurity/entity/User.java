package me.loda.spring.springsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//luu tru thong tin 1 doi tuong user
@Component
public class User {
    private int id;

    private String name;

    private String email;

    private String phone;

    private String avatar;

    private String password;
}
