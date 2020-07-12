package com.learn.brewery.controller;

import com.learn.brewery.services.BeerService;
import com.learn.brewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody BeerDto beerDto){
        BeerDto savedBeer = beerService.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("path","/api/v1/beer/"+savedBeer.getUuid());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity updateBeer(@PathVariable UUID beerId, @RequestBody BeerDto beerDto){
        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    //Important thing to note here is the @ResponseStatus Annotation,
    //This is considered to a alternate method to send response apart from using ResponseEntity Object
    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId){
        beerService.deleteBeerById(beerId);
    }
}
