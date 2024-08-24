package com.prj.user.usecase.service;

import com.prj.user.domain.User;
import com.prj.user.usecase.inport.IUserService;
import com.prj.user.usecase.outport.IUserProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final IUserProvider userProvider;

    @Override
    public void userJoin(User user) {
        /*
            - 회원가입 Entity 가기전에 기본적인 토큰 생성 / 회원 가입 check / 등 필요한 내부 로직 구현 필요
            - 해당 ServiceImpl 에서 모든 서비스 로직 구현 해야 한다.
            - 모든 공통 로직은 user-biz 에 common 패케이지 생성 후 내부 로직에 필요한 공통 로직들을 구현 하여 해당 서비스에서 사용한다.
            - 모든 회원가입에 대한 처리가 완료 되었으면 IUserProvider 로 전달
         */
        userProvider.userJoin(user);
    }
}
