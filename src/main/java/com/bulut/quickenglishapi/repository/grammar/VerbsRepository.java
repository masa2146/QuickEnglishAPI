package com.bulut.quickenglishapi.repository.grammar;

import com.bulut.quickenglishapi.model.grammar.Verbs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VerbsRepository extends MongoRepository<Verbs,String> {
}
