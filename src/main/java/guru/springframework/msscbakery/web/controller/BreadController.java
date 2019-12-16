package guru.springframework.msscbakery.web.controller;

import guru.springframework.msscbakery.services.BreadService;
import guru.springframework.msscbakery.web.model.BreadDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/bread")
@RestController
public class BreadController {

    private final BreadService breadService;

    public BreadController(BreadService breadService) {
        this.breadService = breadService;
    }

    @GetMapping({"/{breadId}"})
    public ResponseEntity<BreadDto> getBread(@PathVariable("breadId") UUID breadId){

//        return new ResponseEntity<>(BreadDto.builder().build(), HttpStatus.OK);
        return new ResponseEntity<>(breadService.getBreadId(breadId), HttpStatus.OK);
    }

}
