package com.example.springcloudstreamconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ConsumerController {


    @StreamListener("input")
    public void consumeMessage(Book book) {
        log.info("Consumed payload {}", book);
    }
}
