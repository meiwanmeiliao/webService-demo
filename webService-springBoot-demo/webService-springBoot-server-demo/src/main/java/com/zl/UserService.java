package com.zl;

import javax.jws.WebService;

/**
 * @author zhuolin
 * @program: webService-demo
 * @date 2019/1/4
 * @description: ${description}
 **/
@WebService
public interface UserService {

    public User getUser1 (String name, String age) ;

    public User getUser2 (String name, String age);
}

