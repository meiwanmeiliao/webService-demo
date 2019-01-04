package com.zl;

import com.zl.client.User;
import com.zl.client.UserService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.ArrayList;

/**
 * @author zhuolin
 * @program: webService-demo
 * @date 2019/1/4
 * @description: ${description}
 **/
public class Test {

    public static void main (String[] args) throws Exception {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean=new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://localhost:8080/service/user?wsdl");
        jaxWsProxyFactoryBean.setServiceClass(UserService.class);

        UserService userService=(UserService)jaxWsProxyFactoryBean.create();
        User userResult= userService.getUser1("411001","adfa");
        System.out.println("UserName:"+userResult.toString());
        User userResult1= userService.getUser2("411001","adfa");
        System.out.println("UserName:"+userResult1.toString());

    }
}
