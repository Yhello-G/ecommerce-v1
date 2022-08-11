package com.manuel.ecommerce.dao;

import java.util.List;

import com.manuel.ecommerce.beans.OrderBean;
import com.manuel.ecommerce.beans.TransactionBean;

public interface OrderDao {
	
	String paymentSuccess(String userName,double paidAmount);

	boolean addOrder(OrderBean order);
	
	boolean addTransaction(TransactionBean transaction);
	
	int countSoldItem(String prodId);
	
	List<OrderBean> getAllOrders();
}
