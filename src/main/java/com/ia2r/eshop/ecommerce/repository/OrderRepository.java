package com.ia2r.eshop.ecommerce.repository;

import com.ia2r.eshop.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
