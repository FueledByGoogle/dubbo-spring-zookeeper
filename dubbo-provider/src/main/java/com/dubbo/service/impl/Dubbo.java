package com.dubbo.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dubbo {
	
	public static void main (String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-remote.xml");
		System.out.println(context.getDisplayName() + ":here");
		context.start();
		System.out.println("provider start");
		System.in.read();
		context.close();
	}
}