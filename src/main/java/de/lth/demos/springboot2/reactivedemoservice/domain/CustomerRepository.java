package de.lth.demos.springboot2.reactivedemoservice.domain;

import reactor.core.publisher.Flux;

public interface CustomerRepository {
    Flux< Customer > getAll();
}
