package org.example.order.controller;

import org.example.order.model.OrderModel;
import org.example.order.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderServiceImpl orderService;

	@GetMapping
	public List<OrderModel> getAllOrders() {
		return orderService.listOrders();
	}

	@GetMapping("/{orderId}")
	public OrderModel getOrder(@PathVariable int orderId) {
		return orderService.getOrder(orderId);
	}
}
