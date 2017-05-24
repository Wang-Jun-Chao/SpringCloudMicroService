package com.example.spring.cloud;

import com.example.spring.cloud.web.ComputeController;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Author: 王俊超
 * Date: 2017-05-23 21:51
 * All Rights Reserved !!!
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class ApplicationTest {
    private MockMvc mvc;

    @Before
    public void setUp() throws  Exception {
        mvc = MockMvcBuilders.standaloneSetup(new ComputeController()).build();
    }

    @Test
    public void testAdd() throws  Exception {
        mvc.perform(MockMvcRequestBuilders.get("/add?a=1&b=2"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("3")));
    }
}
