package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;

@Service
public interface UserService {
	List<User> hello()throws Exception;
}
