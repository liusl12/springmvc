package com.liusl.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * created by l1 on 2017/11/21.
 */
public class Spittler {
    private Long id;

    @NotNull
    @Size(min = 5,max = 16)
    private String username;    //用户名,非空,5到16个字符

    @NotNull
    @Size(min = 5,max = 25)
    private String password;    //密码，非空，5到25个字符

    @NotNull
    @Size(min = 5,max = 30)
    private String lastName;    //名，非空，5到30个字符

    @NotNull
    @Size(min = 5,max = 30)
    private String firstName;   //姓，非空，5到30个字符

    public Spittler(){

    }
    public Spittler(String username,String password,String lastName,String firstName){
        this.id = new java.util.Random().nextLong();
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
