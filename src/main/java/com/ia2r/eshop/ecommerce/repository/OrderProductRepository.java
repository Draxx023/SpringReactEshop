package com.ia2r.eshop.ecommerce.repository;

import com.ia2r.eshop.ecommerce.model.OrderProduct;
import com.ia2r.eshop.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
