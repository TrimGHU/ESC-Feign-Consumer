package com.hugui.feign.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hugui.dto.User;
import com.hugui.feign.consumer.service.HelloService;
import com.hugui.feign.consumer.service.RefactorHelloService;

/**
@date : 2017年8月29日
@author : hugui
@description : TODO
**/

@RestController
public class ConsumerController {

	@Autowired
	HelloService helloService;
	
	@Autowired
	RefactorHelloService refactorHelloService;
	
	@RequestMapping(value="/feign-consumer", method=RequestMethod.GET)
	public String helloConsumer(){
		return helloService.hello();
	}
	
	@RequestMapping(value="/feign-consumer-2", method=RequestMethod.GET)
	public String helloConsumer2(){
		StringBuffer sb = new StringBuffer();
		sb.append(helloService.hello()).append("\n");
		sb.append(helloService.hello("hugui")).append("\n");
		sb.append(helloService.hello("hugui", 30)).append("\n");
		sb.append(helloService.hello(new User("hugui", 30)));
		return sb.toString();
	}
	
	@RequestMapping(value="/feign-consumer-3", method=RequestMethod.GET)
	public String helloConsumer3(){
		StringBuffer sb = new StringBuffer();
		sb.append(refactorHelloService.hello("hugui")).append("\n");
		sb.append(refactorHelloService.hello("hugui", 30)).append("\n");
		sb.append(refactorHelloService.hello(new User("hugui", 30)));
		return sb.toString();
	}
}

