package com.practice.https;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luo Bao Ding
 * @since 2018/11/1
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "hi";
    }

}
