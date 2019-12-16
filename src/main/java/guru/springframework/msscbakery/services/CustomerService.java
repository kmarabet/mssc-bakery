package guru.springframework.msscbakery.services;

import guru.springframework.msscbakery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    public CustomerDto getCustomerId(UUID customerId);
}
