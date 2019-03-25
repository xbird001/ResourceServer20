package com.dse.web.test.controller;


import com.dse.web.test.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author subiao_zhou
 * @since 2019-01-17
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource(name = "UserServiceImpl")
    private UserService userService;

    @RequestMapping("index")
    public Object index(Authentication authentication) {
        Object obj = ((ArrayList)authentication.getPrincipal()).get(0);
        System.out.println(obj);
        return obj;
    }

    @RequestMapping("save")
    public Object save() {
        userService.saveAll();
        return "123";
    }


}
