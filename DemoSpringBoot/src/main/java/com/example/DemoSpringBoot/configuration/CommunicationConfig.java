package com.example.DemoSpringBoot.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class CommunicationConfig {

    //Creating Bean for web client builder

    @Bean
    @LoadBalanced
    WebClient.Builder getWebClientBuilder(){
        return WebClient.builder();
    }
}
