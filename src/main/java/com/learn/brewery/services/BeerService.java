package com.learn.brewery.services;

import com.learn.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerid, BeerDto beerDto);

    void deleteBeerById(UUID beerId);
}
