package com.hydroponics.product_service.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "lettuce")
public class Lettuce {
    @Id
    private UUID id;
    private float weight;
    private LocalDateTime datePlanted;
    private LocalDateTime dateCollected;
}
