package com.hailang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/demo")
public class ProviderController {

    @GetMapping
    public Map<String,Object> getProvider(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","hailang");
        map.put("content","this is first provider");
        return map;
    }
}
