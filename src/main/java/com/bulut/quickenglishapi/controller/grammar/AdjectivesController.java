package com.bulut.quickenglishapi.controller.grammar;

import com.bulut.quickenglishapi.model.grammar.Adjectives;
import com.bulut.quickenglishapi.repository.grammar.AdjectivesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/grammar/adjectives")
public class AdjectivesController {

    @Autowired
    private  AdjectivesRepository repository;



    public Page<Adjectives> getAlAdjectives(){
        Pageable pageable = PageRequest.of(0, 10);
        return repository.findAll(pageable);
    }
}
