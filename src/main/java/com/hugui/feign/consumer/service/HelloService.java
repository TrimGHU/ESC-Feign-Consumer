package com.hugui.feign.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hugui.dto.User;
import com.hugui.feign.consumer.log.FullLogConfiguration;

/**
 * @date : 2017年8月29日
 * @author : hugui
 * @description : TODO
 **/

@FeignClient(name = "HUGUI", fallback = HelloServiceFallBack.class, configuration = FullLogConfiguration.class)
public interface HelloService {

	@RequestMapping("/hello")
	String hello();

	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	String hello(@RequestParam("name") String name);

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

	@RequestMapping(value = "/hello3", method = RequestMethod.POST)
	String hello(@RequestBody User user);
}
