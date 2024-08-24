package com.prj.user.out.entity;

import com.prj.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    private Long id;
    private String username;
    private String password;
    private String email;
    private String role;
    private Date create_at;

    public static UserEntity userFromUserEntity(User user) {
        return new UserEntity(
          user.getId(),
          user.getUsername(),
          user.getPassword(),
          user.getEmail(),
          user.getRole(),
          user.getCreate_at()
        );
    }
}
