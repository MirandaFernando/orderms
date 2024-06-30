package tech.buildrun.orderms.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String QUEUE_CREATED_QUEUE = "order-created";
}
