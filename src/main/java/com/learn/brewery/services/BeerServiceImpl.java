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
}
