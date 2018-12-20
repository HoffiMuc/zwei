package com.example.demo.sink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.example.demo.channels.ZweiSink;

@Component
public class ZweiReceive {
    private static final Logger log = LoggerFactory.getLogger(ZweiReceive.class);

    @StreamListener(ZweiSink.INPUT)
    public void zweiReceive(String message, Message<String> wholeMessage) {
        log.info("received: {}", wholeMessage);
    }

}
