package cn.hexg.testjenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController
 *
 * @author Hxg
 * @date 2020/11/21 21:41
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "Hello test Jenkins";
    }
}
