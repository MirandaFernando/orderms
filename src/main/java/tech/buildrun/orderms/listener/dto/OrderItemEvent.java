package tech.buildrun.orderms.listener.dto;

public record OrderItemEvent(String produto,
                             Integer quantidade,
                             String preco) {
}
