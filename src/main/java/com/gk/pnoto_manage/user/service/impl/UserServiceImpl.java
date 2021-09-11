package com.gk.pnoto_manage.user.service.impl;

import com.gk.pnoto_manage.domain.User;
import com.gk.pnoto_manage.user.service.UserService;
import com.gk.pnoto_manage.user.userDao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao =  null;
    @Override
    public void login(User user) {
        String username = user.getUsername();
        User findUser = dao.selectUser(username);
        System.out.println(findUser);
    }
}