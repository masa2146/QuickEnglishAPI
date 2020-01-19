package com.bulut.quickenglishapi.repository.grammar;

import com.bulut.quickenglishapi.model.grammar.Pronouns;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PronounsRepository extends MongoRepository<Pronouns, String> {

    Page<Pronouns> findAll(Pageable pageable);
}
