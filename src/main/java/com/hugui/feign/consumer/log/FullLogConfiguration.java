package com.hugui.feign.consumer.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

/**
@date : 2017年8月30日
@author : hugui
@description : TODO
**/

@Configuration
public class FullLogConfiguration {

	@Bean
	Logger.Level feignLoggerLevel(){
		return Logger.Level.FULL;
	}
	
}

