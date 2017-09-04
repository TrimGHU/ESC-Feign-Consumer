package com.hugui.feign.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.hugui.service.HelloService;

/**
 * @date : 2017年8月30日
 * @author : hugui
 * @description : TODO
 **/

@FeignClient(value = "HUGUI")
public interface RefactorHelloService extends HelloService{

}
