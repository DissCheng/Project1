package com.lzu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.lzu.service")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
    
}
