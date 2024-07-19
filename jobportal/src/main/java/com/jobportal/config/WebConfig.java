//package com.jobportal.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                        .allowedOriginPatterns("http://localhost:4200")  // Use patterns to match origins
//                        .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS")
//                        .allowedHeaders("*")
//                        .allowCredentials(true);  // Allow credentials
//            }
//        };
//    }
//}
