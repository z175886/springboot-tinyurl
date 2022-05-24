package com.spring.utility.test;

import com.spring.utility.Controller.HomePageController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


public class SmokeTest {
    @Autowired
    private HomePageController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

}
