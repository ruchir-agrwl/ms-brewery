package com.learn.brewery.controller;

import com.learn.brewery.services.BeerService;
import com.learn.brewery.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    BeerService beerService;

    public BeerController(BeerService beerService){
        this.beerService = beerService;
    }

    @GetMapping({"{beerId}"})
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId){
        return  new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
}
