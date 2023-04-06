package com.ia2r.eshop.ecommerce.repository;

import com.ia2r.eshop.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
