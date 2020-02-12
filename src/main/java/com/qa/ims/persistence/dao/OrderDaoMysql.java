//package com.qa.ims.persistence.dao;
//
//import java.util.List;
//
//
//import com.qa.ims.persistence.domain.Orders;
//import com.qa.ims.services.CrudServices;
//import com.qa.persistence.Dao;
//import domain.Order;
//public class OrderService implements CrudServices<Orders> {
//	
//	Dao<Orders> orderDao;
//	
//	public OrderService(Dao<Orders> orderDao) {
//		
//		this.orderDao = orderDao;
//		
//	}
//	public List<Orders> readAll() {
//		
//		return orderDao.readAll();
//		
//	}
//	
//	public Orders create(Orders order) {
//		
//		return orderDao.create(order);
//		
//	}
//	
//	public Orders update(Orders order) {
//		
//		return orderDao.update(order);
//		
//	}
//	public void delete(Long id) {
//		
//		orderDao.delete(id);
//		
//	}
//}