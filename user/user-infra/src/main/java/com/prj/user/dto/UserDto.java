package com.prj.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter

public class UserDto {

    @NotNull
    private Long id;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotBlank
    private String email;
    @NotNull
    @NotBlank
    private String role;
    private Date create_at;
}
