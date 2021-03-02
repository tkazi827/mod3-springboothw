package com.example.server.service;

import com.example.server.model.Cats;
import org.springframework.http.HttpStatus;

public interface CatService {
    Iterable<Cats> getCats();
    Cats findCatById(Long id);
    Cats createCat(Cats cat);
    HttpStatus deleteCat(Long id);
}
