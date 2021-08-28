package com.om.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCloudController {

    @Autowired
    Info info;

    @GetMapping("/get")
    public String getInfo(){
        return info.getMessage();
    }
}
