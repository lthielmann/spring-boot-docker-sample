package de.lth.demos.springboot2.reactivedemoservice.interfaces;

import de.lth.demos.springboot2.reactivedemoservice.domain.Customer;
import de.lth.demos.springboot2.reactivedemoservice.domain.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping( "customers" )
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController( final CustomerRepository customerRepository ) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public Flux< Customer > getAll() {
        return customerRepository.getAll();
    }
}
