package com.tedu.sp01.serivce;


import com.tedu.sp01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}