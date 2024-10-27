package com.cuzcosieste.followme.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListenerDatabase {

    @KafkaListener(topics = "topic-register-database")
    void listener(String data) {
        log.info("Received message [{}] in group1", data);
    }
}
