package com.bulut.quickenglishapi.repository.grammar;

import com.bulut.quickenglishapi.model.grammar.Nouns;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NounsRepository extends MongoRepository<Nouns,String> {
    public List<Nouns> findAllBy();
    public List<Nouns> findAllBy(Pageable pageable);
}
