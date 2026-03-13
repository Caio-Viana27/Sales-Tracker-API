package spring.salestracker.api.dto;


import spring.salestracker.api.entity.CustomerEntity;
import spring.salestracker.api.entity.OrderStatus;
import spring.salestracker.api.entity.ProductEntity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public record OrderDTO (String id,
                        CustomerEntity customer,
                        List<ProductEntity> products,
                        BigDecimal value,
                        OrderStatus status,
                        int paymentDay,
                        Timestamp createdAt) {
}