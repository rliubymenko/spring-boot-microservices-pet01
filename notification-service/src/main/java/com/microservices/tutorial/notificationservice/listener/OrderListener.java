package com.microservices.tutorial.notificationservice.listener;

import com.microservices.tutorial.notificationservice.event.OrderPlacedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrderListener {

    @KafkaListener(topics = "notificationTopic")
    public void handleNotification(OrderPlacedEvent orderPlacedEvent) {
        // here is the logic to an email notification
        log.info("Received Notification for the Order - {}", orderPlacedEvent.getOrderNumber());
    }
}
