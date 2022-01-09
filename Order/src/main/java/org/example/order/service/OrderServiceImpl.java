package org.example.order.service;

import org.example.order.model.OrderModel;
import org.example.order.persistence.OrderPersistenceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl {

	@Autowired
	OrderPersistenceImpl orderPersistence;

	public List<OrderModel> listOrders() {
		return orderPersistence.listAllOrders();
	}

	public OrderModel getOrder(int orderId) {
		return orderPersistence.getOrder(orderId);
	}
}
