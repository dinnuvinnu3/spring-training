package com.example.DbsProducer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.DbsProducer.dto.OrderStatus;

@Component
public class Consumer {
    @RabbitListener(queues = "dbs_queue")
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
    }
}