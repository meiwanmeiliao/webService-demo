package com.zl;

import javax.jws.WebService;

/**
 * @author zhuolin
 * @program: webService-demo
 * @date 2019/1/4
 * @description: ${description}
 **/
@WebService
public class HelloService {

    public void sayHello (String name) {
        System.out.println(name + "hello !");
    }

    public String sayHello2 (String name) {
        return name + "hello !";
    }
}

