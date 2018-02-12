package com.hailang.controller;

import com.hailang.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController("/consumer")
public class ConsumerController {

    @Autowired
    private ProviderService providerService;

    @GetMapping
    public Map<String,Object> getConsumer(){
        return providerService.getProvider();
    }
 }
