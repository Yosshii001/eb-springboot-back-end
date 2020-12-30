package com.jyoshita.sample.ecsspringbootbackend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.jyoshita.sample.ecsspringbootbackend")
public class MvcConfig implements WebMvcConfigurer {

}
