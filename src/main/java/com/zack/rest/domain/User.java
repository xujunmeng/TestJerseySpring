package com.zack.rest.domain;

/**
 * Created by james on 2017/5/31.
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class User{

    private static final long serialVersionUID = 1L;

    private String userName = "";

    private int age = 0;

    public User() {

    }

    public User(String userName,int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "name:" + userName + " age:" + age;
    }
}
