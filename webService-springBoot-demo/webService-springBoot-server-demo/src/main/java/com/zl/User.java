package com.zl;

import java.io.Serializable;

/**
 * @author zhuolin
 * @program: webService-demo
 * @date 2019/1/4
 * @description: ${description}
 **/
public class User implements Serializable {

    String name;

    String age;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAge () {
        return age;
    }

    public void setAge (String age) {
        this.age = age;
    }

    @Override
    public String toString () {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
