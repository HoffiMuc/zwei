package com.example.demo.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ZweiSink {

    String INPUT = "eins2zweiChannel";

    @Input(INPUT)
    SubscribableChannel zweiInput();
}
