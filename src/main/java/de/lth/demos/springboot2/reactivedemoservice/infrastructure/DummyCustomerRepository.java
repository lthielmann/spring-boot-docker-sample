package de.lth.demos.springboot2.reactivedemoservice.infrastructure;

import de.lth.demos.springboot2.reactivedemoservice.domain.Customer;
import de.lth.demos.springboot2.reactivedemoservice.domain.CustomerRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.stream.IntStream;

@Repository
public class DummyCustomerRepository implements CustomerRepository {
    @Override
    public Flux< Customer > getAll() {
        return Flux.fromStream(
                IntStream.range( 0, 1000 ).mapToObj( Customer::new )
        );
    }
}
