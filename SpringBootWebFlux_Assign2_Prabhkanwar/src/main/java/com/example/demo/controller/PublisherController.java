package com.example.demo.controller;

import com.example.demo.model.Publisher;
import com.example.demo.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/publishers")
@RequiredArgsConstructor
public class PublisherController {
    private final PublisherService publisherService;

    @GetMapping
    public Flux<Publisher> getAll() {
        return publisherService.getAllPublishers();
    }

    @PostMapping
    public Mono<Publisher> add(@RequestBody Publisher publisher) {
        return publisherService.addPublisher(publisher);
    }
}
