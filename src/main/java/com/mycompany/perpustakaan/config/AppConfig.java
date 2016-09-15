/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.perpustakaan.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * Controller class awal untuk mengatur proses REST
 * @author Angga Hantara com.mycompany.perpustakaan
 * @version 1.0.0
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mycompany.perpustakaan")
public class AppConfig {
    
}
