package com.example.kafkaconsumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaMessageListener {

    @KafkaListener(topics = "${kafka.topic-name}", groupId = "${kafka.group-id}")
    public void consume(String message) {
        log.info("Received Message: {}", message);
    }
}
