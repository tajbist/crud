package com.config;

import com.dao.IStudent;
import com.dao.StudentDao;
import com.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Oops on 7/23/2016.
 */
@Configuration
public class Config {

    @Bean
    public StudentService service(){
        return new StudentService();
    }

    @Bean
    public IStudent dao(){
        return new StudentDao();
    }
}
