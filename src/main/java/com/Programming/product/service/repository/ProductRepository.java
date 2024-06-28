package com.Programming.product.service.repository;

import com.Programming.product.service.module.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
