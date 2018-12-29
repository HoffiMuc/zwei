package com.example.demo.configs;

import com.example.demo.channels.ZweiSink;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(ZweiSink.class)
public class StreamConfigs {

}
