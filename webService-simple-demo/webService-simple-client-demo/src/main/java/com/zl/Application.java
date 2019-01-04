package com.zl;

import com.zl.client.HelloService;
import com.zl.client.HelloServiceService;

/**
 * @author zhuolin
 * @program: webService-demo
 * @date 2019/1/4
 * @description: ${description}
 **/
public class Application {

    public static void main (String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        HelloServiceService helloServiceService = new HelloServiceService();
        HelloService hello = helloServiceService.getHelloServicePort();
        System.out.println(hello.sayHello2("梨花"));
        hello.sayHello("李华");
    }
}
