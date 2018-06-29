package com.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.dubbo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public int getId () {
		System.out.println("getId");
		return 1;
	}

	@Override
	public String getName() {
		return"hello";
	}
	
}
