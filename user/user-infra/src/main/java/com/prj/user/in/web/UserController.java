package com.prj.user.in.web;

import com.prj.user.dto.UserDto;
import com.prj.user.usecase.inport.IUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserControllerHelper userControllerHelper;
    private final IUserService userService;

    @PostMapping("/join")
    public void join(@Valid @RequestBody UserDto userDto) {
        userService.userJoin(userControllerHelper.getUserFromRequest(userDto));
    }
}
