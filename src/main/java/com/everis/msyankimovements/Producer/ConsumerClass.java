package com.everis.msyankimovements.Producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerClass {

  @KafkaListener(topics = "user")
  public void consume(String user) {
    log.info("Consumer received message " + user);
  }
}
