package com.bulut.quickenglishapi.repository.grammar;

import com.bulut.quickenglishapi.model.grammar.Adjectives;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdjectivesRepository extends MongoRepository<Adjectives, String> {

    Page<Adjectives> findAll(Pageable pageable);
}
