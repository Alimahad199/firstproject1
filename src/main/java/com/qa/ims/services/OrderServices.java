// package com.qa.ims.services;
//import java.util.List;
//
//import com.qa.ims.persistence.dao.Dao;
//import com.qa.ims.persistence.domain.Orders;
//
//public class OrderServices implements CrudServices<Orders> {
//	
//	private Dao<Orders> orderDao;
//	
//	public OrderServices(Dao<Orders> orderDao) {
//		
//		this.orderDao = orderDao;
//	}
//	
//	public List<Orders> readAll() {
//		
//		return orderDao.readAll();
//	}
//	
//	public Orders create(Orders order) {
//		
//		return orderDao.create(order);
//	}
//	
//	public Orders update(Orders order) {
//		
//		return orderDao.update(order);
//	}
//	
//	public void delete(Long id) {
//		
//		orderDao.delete(id);
//	}
//}