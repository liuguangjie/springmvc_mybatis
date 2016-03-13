package com.ssm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.mapper.UserMapper;
import com.ssm.po.User;

public class testUserService {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper=ac.getBean(UserMapper.class);
		User user=userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}
}
