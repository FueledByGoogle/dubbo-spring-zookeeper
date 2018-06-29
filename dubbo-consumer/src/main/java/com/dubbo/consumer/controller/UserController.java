package com.dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubbo.service.UserService;

@Controller("userController")
@RequestMapping("userController")
public class UserController {
	
	@Autowired
	UserService userService;

	@ResponseBody
	@RequestMapping ("getiD")
	public int getiD() {
		int num = userService.getId();
		System.out.println("in controller");
		return num;
//		return 1;
	}
	
	@ResponseBody
	@RequestMapping("getName")
	public String getName() {
		String name = new String(userService.getName());
		return name;
	}
}
