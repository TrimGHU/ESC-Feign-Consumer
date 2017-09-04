package com.hugui.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
@date : 2017年8月8日
@author : hugui
@description : TODO
**/

@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignConsumerApplication {

	//配置全局日志类型
	/**@Bean
	Logger.Level feignLoggerLevel(){
		return Logger.Level.FULL;
	}
	**/
	
	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerApplication.class, args);
	}
}

