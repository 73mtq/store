package com.codewithmosh.store;

import com.codewithmosh.store.Service.OrderService;
import com.codewithmosh.store.Service.PayPalPaymentService;
import com.codewithmosh.store.Service.StripePaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
     ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
