package com.gk.pnoto_manage;

import com.gk.pnoto_manage.user.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    private MockMvc mockMvc;
    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }
    @Test
    public void login() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/login").param("User","1")).andReturn();
    }

}
