package com.example.demo.sink;

import com.example.demo.channels.ZweiSink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class ZweiReceive {
    private static final Logger log = LoggerFactory.getLogger(ZweiReceive.class);

    public static String lastMessage;

    @StreamListener(ZweiSink.INPUT)
    public void zweiReceive(String message, Message<String> wholeMessage) {
        ZweiReceive.lastMessage = message;
        log.info("received: {}", wholeMessage);
    }

}
