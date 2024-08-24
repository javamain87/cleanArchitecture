package com.prj.user.usecase.outport;

import com.prj.user.domain.User;

public interface IUserProvider {

    void userJoin(User user);
}
