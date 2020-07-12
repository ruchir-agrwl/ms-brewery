package com.learn.brewery.services;

import com.learn.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return  BeerDto.builder()
                .uuid(beerId)
                .beerName("BIRA")
                .beerStyle("Craft")
                .price(165L)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .uuid(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerid, BeerDto beerDto) {
        System.out.println("Beer Update for the passed object completed");
        //TODO add update Beer implementation, based on the logic
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        System.out.println("Deleting Beer Object of BeerId => "+beerId);
    }


}
