package com.prj.user.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class User {

    private Long id;
    private String username;
    private String password;
    private String email;
    private String role;
    private Date create_at;
}
