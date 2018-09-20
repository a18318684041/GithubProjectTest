package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Gordon
 */
@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping
    public String sayHello(){
        return "hello";
    }

}
