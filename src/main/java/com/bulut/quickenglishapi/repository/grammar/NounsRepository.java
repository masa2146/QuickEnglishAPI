package com.bulut.quickenglishapi.repository.grammar;

import com.bulut.quickenglishapi.model.grammar.Nouns;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NounsRepository extends MongoRepository<Nouns, String> {

    Page<Nouns> findAll(Pageable pageable);
}
