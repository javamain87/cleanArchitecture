package com.prj.user.out.adapter;

import com.prj.user.domain.User;
import com.prj.user.out.entity.UserEntity;
import com.prj.user.out.mapper.UserMapper;
import com.prj.user.usecase.outport.IUserProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserProviderImpl implements IUserProvider {

    private final UserMapper userMapper;

    @Override
    public void userJoin(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity = userEntity.userFromUserEntity(user);
        userMapper.userJoin(userEntity);
    }
}
