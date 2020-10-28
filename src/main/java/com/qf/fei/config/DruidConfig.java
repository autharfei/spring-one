package com.qf.fei.config;

import com.qf.fei.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
    public class DruidConfig {
        @Bean
    public User user(){
            User user = new User();
            user.setUsername("zanshang");
            return user;
        }


}
