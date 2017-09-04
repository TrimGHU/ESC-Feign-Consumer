package com.hugui.feign.consumer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.hugui.dto.User;

/**
@date : 2017年8月30日
@author : hugui
@description : TODO
**/

@Component
public class HelloServiceFallBack implements HelloService{

	public String hello() {
		return "error";
	}

	public String hello(@RequestParam("name") String name){
		return "error";
	}

	public String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age){
		return new User("unkown", 0).toString();
	}

	public String hello(@RequestBody User user){
		return "error";
	}

}

