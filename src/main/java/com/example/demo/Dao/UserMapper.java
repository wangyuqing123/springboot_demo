package com.example.demo.Dao;

import java.util.List;

import com.example.demo.Entity.User;
 


//注意：别忘了此注解 注入Bean 
public interface UserMapper {
 
    List<User> hello()throws Exception;
}
