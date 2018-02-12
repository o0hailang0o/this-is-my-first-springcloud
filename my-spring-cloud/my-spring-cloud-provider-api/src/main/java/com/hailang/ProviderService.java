package com.hailang;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("my-spring-cloud-provider")
public interface ProviderService {

    @GetMapping(value = "/get/provider")
    public Map<String,Object> getProvider();
}
