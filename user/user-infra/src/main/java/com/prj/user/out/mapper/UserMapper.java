package com.prj.user.out.mapper;

import com.prj.user.out.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void userJoin(UserEntity userEntity);
}
