package tech.buildrun.orderms.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;

@Document(collection = "tbl_orders")
public class OrderEntity {

    @MongoId
    private Long orderId;
    private Long customerId;
    private BigDecimal total;
    private List<OrderItem> items;
}
