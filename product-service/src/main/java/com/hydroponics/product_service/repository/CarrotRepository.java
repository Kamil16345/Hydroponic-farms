package com.hydroponics.product_service.repository;

import com.hydroponics.product_service.product.Carrot;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CarrotRepository extends MongoRepository<Carrot, String> {
}
