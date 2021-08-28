package com.om.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
public class Info {

    @Value("${my.message: default value}")
    private String message;

    public String getMessage(){
        return message;
    }
}
