package com.example.server.repository;

import com.example.server.model.Cats;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cats, Long> {
}
