package com.zl;

import javax.jws.WebService;

/**
 * @author zhuolin
 * @program: webService-demo
 * @date 2019/1/4
 * @description: ${description}
 **/
@WebService(targetNamespace = "http://zl.com/", endpointInterface = "com.zl.UserService")
public class UserServiceImpl implements UserService {

    @Override
    public User getUser1 (String name, String age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        return user;
    }

    @Override
    public User getUser2 (String name, String age) {
        User user = new User();
        user.setAge(age + "afalkkdjf");
        user.setName(name);
        return user;
    }
}
