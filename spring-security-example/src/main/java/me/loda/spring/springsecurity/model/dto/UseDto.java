package me.loda.spring.springsecurity.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UseDto {
    private int id;

    private String name;

    private String email;

    private String phone;

    private String avatar;
}
