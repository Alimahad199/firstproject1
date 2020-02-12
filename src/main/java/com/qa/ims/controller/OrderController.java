//package com.qa.ims.controller;
//
//import java.util.List;
//
//import org.apache.log4j.Logger;
//
//import com.qa.ims.persistence.domain.Orders;
//import com.qa.services.CrudServices;
//
//import utils.Utils;
//
//import domain.Order;
//
///**
// * Takes in order details for CRUD functionality
// *
// */
//
//
//public class OrderController implements CrudController<Orders>{
//	
//	public static final Logger LOGGER = Logger.getLogger(OrderController.class);
//	
//	private CrudServices<Orders> OrdersService;
//	
//	public OrderController(CrudServices<Orders> OrdersService) {
//		
//		this.OrdersService = OrdersService;
//	
//	}
//	
//	String getInput() {
//		return Utils.getInput();
//	}
//	
//	public List<Orders> readAll() {
//		
//		List<Orders> order = OrdersService.readAll();
//		
//		for (@SuppressWarnings("unused") Orders orders : order) {
//			
//			LOGGER.info(order.toString());
//		}
//		return order;
//	}
//	public Orders create() {
//		
//		
//		
//		LOGGER.info("Please enter a price");
//		
//		Double price = Double.valueOf(getInput());
//		
//		LOGGER.info("Please enter a customer_ID");
//		
//		Long customer_ID = Long.valueOf(getInput());
//		
//		Orders order = OrdersService.create(new Orders(price, customer_ID));
//		
//		LOGGER.info("Order created");
//		
//		return order;
//	}
//	public Orders update() {
//		
//		
//		
//		LOGGER.info("Please enter the ID of the order you would like to update");
//		
//		Long id = Long.valueOf(getInput());
//		
//		LOGGER.info("Please enter the ID of the customer you would like to update");
//		
//		Long customer_ID = Long.valueOf(getInput());
//		
//		LOGGER.info("Please enter a price_per_items");
//		
//		Double price = Double.valueOf(getInput());
//		
//		Orders order = OrdersService.update(new Orders(id, price, customer_ID));
//		
//		LOGGER.info("order List Updated");
//		
//		return order;
//	}
//	public void delete() {
//		
//		
//		
//		LOGGER.info("Please enter the ID of the item you would like to delete");
//		
//		Long id = Long.valueOf(getInput());
//		
//		OrdersService.delete(id);
//	}
//	}