package com.bulut.quickenglishapi.repository.grammar;

import com.bulut.quickenglishapi.model.grammar.Verbs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VerbsRepository extends MongoRepository<Verbs, String> {

    Page<Verbs> findAll(Pageable pageable);
}
