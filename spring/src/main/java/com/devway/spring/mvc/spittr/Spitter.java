package com.devway.spring.mvc.spittr;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author devway
 * @date 2017-12-20
 */
public class Spitter {
     @NotNull(message = "名字不能为空")
    @Size(max = 30,min = 6)
    private String name;

    @NotNull(message = "密码不能为空")
    @Size(max = 30,min = 6)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
