package com.department.HR;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingRestController {
    @RequestMapping("/getPing")
    public String getPing(){
        return "Hello Abinaya!!";
    }
}
