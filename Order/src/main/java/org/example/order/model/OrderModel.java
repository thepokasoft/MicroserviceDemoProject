package org.example.order.model;


public class OrderModel {

	private Integer id;
	private Integer customerId;
	private String itemId;
	private String date;

	public OrderModel(Integer id, Integer customerId, String itemId, String date) {
		this.id = id;
		this.customerId = customerId;
		this.itemId = itemId;
		this.date = date;
	}

	public OrderModel() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
