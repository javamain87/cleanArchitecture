package com.prj.user.in.web;

import com.prj.user.domain.User;
import com.prj.user.dto.UserDto;
import org.springframework.stereotype.Controller;

@Controller
public class UserControllerHelper {

    public User getUserFromRequest(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setRole(userDto.getRole());

    }
}
