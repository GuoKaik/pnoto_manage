package com.gk.pnoto_manage.user.controller;
/**
 * 1. UserDao 和 UserMapper.xml的映射
 *  要在启动类中增加@Mapper(),扫描Mapper文件。否则会提示"Consider defining a bean of type 'com.gk.pnoto_manage.user.userDao.UserDao' in your configuration."
 *  扫描不到Dao
 * 2.整合MyBatis,打印sql日志
 * 配置：
 *  logging:
 *   level:
 *     com.gk.pnoto_manage.user.userDao.UserDao : DEBUG
 * 3.将查询的结果映射成对象，在Bean中要有构造方法
 */

import com.gk.pnoto_manage.domain.User;
import com.gk.pnoto_manage.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller
//@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/login")
    public String login(User user){
        user=new User("gk","111");
        userService.login(user);
        System.out.println("1111");
        return "111";
    }
}
