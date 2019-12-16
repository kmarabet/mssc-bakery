package guru.springframework.msscbakery.web.controller;

import guru.springframework.msscbakery.services.CustomerService;
import guru.springframework.msscbakery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getBread(@PathVariable("customerId") UUID customerId){

//        return new ResponseEntity<>(BreadDto.builder().build(), HttpStatus.OK);
        return new ResponseEntity<>(customerService.getCustomerId(customerId), HttpStatus.OK);
    }

}
