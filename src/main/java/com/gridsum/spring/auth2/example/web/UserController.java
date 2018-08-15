package com.gridsum.spring.auth2.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Description:
 * @Author: liuguo@gridsum.com
 * @Date: 2018/8/15
 */
@RestController
public class UserController {
    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }

}
