package com.hydroponics.product_service.repository;

import com.hydroponics.product_service.product.Lettuce;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface LettuceRepository extends MongoRepository<Lettuce, UUID> {
}
