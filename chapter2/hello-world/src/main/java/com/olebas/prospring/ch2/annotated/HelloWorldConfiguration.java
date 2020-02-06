package com.olebas.prospring.ch2.annotated;

import com.olebas.prospring.ch2.decoupled.HelloWorldMessageProvider;
import com.olebas.prospring.ch2.decoupled.MessageProvider;
import com.olebas.prospring.ch2.decoupled.MessageRenderer;
import com.olebas.prospring.ch2.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
