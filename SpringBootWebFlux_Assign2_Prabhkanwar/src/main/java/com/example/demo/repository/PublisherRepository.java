package com.example.demo.repository;

import com.example.demo.model.Publisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PublisherRepository extends ReactiveMongoRepository<Publisher, String> {
}
