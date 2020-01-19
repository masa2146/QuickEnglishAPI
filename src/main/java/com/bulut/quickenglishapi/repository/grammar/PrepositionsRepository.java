package com.bulut.quickenglishapi.repository.grammar;

import com.bulut.quickenglishapi.model.grammar.Prepositions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrepositionsRepository extends MongoRepository<Prepositions,String> {
}
