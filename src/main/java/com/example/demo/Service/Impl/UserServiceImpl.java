package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.UserMapper;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@Service
public class UserServiceImpl implements UserService{
	 @Autowired
	 UserMapper userMapper;
	@Override
	public List<User> hello()throws Exception {
         List<User> aa = userMapper.hello();
         return aa;
    }

}
