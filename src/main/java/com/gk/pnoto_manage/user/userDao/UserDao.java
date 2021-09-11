package com.gk.pnoto_manage.user.userDao;

import com.gk.pnoto_manage.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User selectUser(String username);
}
