package com.example.demo.service;

import com.example.demo.model.Publisher;
import com.example.demo.repository.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PublisherService {

    private final PublisherRepository publisherRepo;

    public Flux<Publisher> getAllPublishers() {
        return publisherRepo.findAll();
    }

    public Mono<Publisher> addPublisher(Publisher publisher) {
        return publisherRepo.save(publisher);
    }
}
