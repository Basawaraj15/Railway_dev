package com.example.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import com.example.shop.model.ProductOrder;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {

	List<ProductOrder> findByUserId(Integer userId);

	ProductOrder findByOrderId(String orderId);

}
