package org.example.order.persistence;

import org.example.order.model.OrderModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderPersistenceImpl {

	List<OrderModel> orderModelList = new ArrayList<OrderModel>();

	OrderPersistenceImpl() {
		OrderModel order1 = new OrderModel(101, 201, "item-01", "01/01/2022");
		OrderModel order2 = new OrderModel(102, 202, "item-02", "02/01/2022");
		OrderModel order3 = new OrderModel(103, 203, "item-03", "03/01/2022");
		orderModelList.add(order1);
		orderModelList.add(order2);
		orderModelList.add(order3);
	}

	public List<OrderModel> listAllOrders() {
		return orderModelList;
	}

	public OrderModel getOrder(int orderId) {
		orderId -= 101;
		if (orderId > orderModelList.size()) {
			return null;
		}
		return orderModelList.get(orderId);
	}
}
