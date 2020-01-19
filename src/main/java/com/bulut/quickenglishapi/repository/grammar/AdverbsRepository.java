package com.bulut.quickenglishapi.repository.grammar;

import com.bulut.quickenglishapi.model.grammar.Adverbs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdverbsRepository extends MongoRepository<Adverbs, String> {

    Page<Adverbs> findAll(Pageable pageable);
}
