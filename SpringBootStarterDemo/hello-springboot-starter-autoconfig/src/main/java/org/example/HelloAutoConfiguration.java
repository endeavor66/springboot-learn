package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({HelloProperties.class})
public class HelloAutoConfiguration {

    @Autowired
    HelloProperties properties;

    @Bean(name = "helloService")
    public HelloService getHelloService(){
        return new HelloService(properties.getName(), properties.getAge());
    }
}
