package com.example.demo.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ZweiSink {

    String INPUT = "zweiInputDef";

    @Input(INPUT)
    SubscribableChannel zweiInput();
}
