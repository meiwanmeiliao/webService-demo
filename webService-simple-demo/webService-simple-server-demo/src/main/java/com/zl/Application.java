package com.zl;

import javax.xml.ws.Endpoint;

/**
 * @author zhuolin
 * @program: webService-demo
 * @date 2019/1/4
 * @description: ${description}
 **/
public class Application {

    public static void main(String[] args) {
        //通过Endpoint发布服务。
        Endpoint.publish("http://localhost:9001/service/sayHello", new HelloService());

        System.out.println("发布服务成功");
    }
}
