/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author александр
 */
@Configuration
@Import({SpringDateConfigMySQL.class})
@ComponentScan(basePackages = {"com.mycompany.service"})
public class RootConfig {
}
