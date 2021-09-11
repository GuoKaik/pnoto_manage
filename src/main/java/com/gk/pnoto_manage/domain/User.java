package com.gk.pnoto_manage.domain;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class User {
    private String username;

    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
