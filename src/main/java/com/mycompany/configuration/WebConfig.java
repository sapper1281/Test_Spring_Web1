/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles2.TilesConfigurer;
import org.springframework.web.servlet.view.tiles2.TilesViewResolver;

/**
 *
 * @author александр
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.mycompany.controller")
public class WebConfig
extends WebMvcConfigurerAdapter {
@Bean
public ViewResolver viewResolver() {
InternalResourceViewResolver resolver =
new InternalResourceViewResolver();
resolver.setPrefix("/WEB-INF/views/");
resolver.setSuffix(".jsp");
resolver.setExposeContextBeansAsAttributes(true);
return resolver;
}
@Override
public void configureDefaultServletHandling(
DefaultServletHandlerConfigurer configurer) {
configurer.enable();
}
}
    


