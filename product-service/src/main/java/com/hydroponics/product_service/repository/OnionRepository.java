package com.hydroponics.product_service.repository;

import com.hydroponics.product_service.product.Onion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface OnionRepository extends MongoRepository<Onion, UUID> {
}
