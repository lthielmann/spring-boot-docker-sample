package de.lth.demos.springboot2.reactivedemoservice.interfaces;

import de.lth.demos.springboot2.reactivedemoservice.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith( SpringRunner.class )
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class CustomerControllerTest {

    @LocalServerPort
    private int port;

    @Test
    public void getAllCustomerByStream() {
        final WebTestClient client = WebTestClient.bindToServer()
                .baseUrl( "http://localhost:" + port + "/customers" )
                .build();

        client.get().exchange()
                .expectStatus().isOk()
                .expectBodyList( Customer.class ).hasSize( 1000 );
    }
}