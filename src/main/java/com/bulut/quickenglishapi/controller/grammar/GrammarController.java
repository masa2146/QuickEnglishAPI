package com.bulut.quickenglishapi.controller.grammar;

import com.bulut.quickenglishapi.model.grammar.*;
import com.bulut.quickenglishapi.repository.grammar.*;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/grammar")
@AllArgsConstructor
public class GrammarController {

    private final AdjectivesRepository adjectivesRepository;
    private final AdverbsRepository adverbsRepository;
    private final NounsRepository nounsRepository;
    private final PrepositionsRepository prepositionsRepository;
    private final PronounsRepository pronounsRepository;
    private final VerbsRepository verbsRepository;

    // GET DATA WITH PAGEABLE

    @GetMapping("/adjectives")
    public ResponseEntity<Page<Adjectives>> getAdjectivesWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<Adjectives> foundData = adjectivesRepository.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {

            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/adverbs")
    public ResponseEntity<Page<Adverbs>> getAdverbsWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<Adverbs> foundData = adverbsRepository.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {

            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/nouns")
    public ResponseEntity<Page<Nouns>> getNounsWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<Nouns> foundData = nounsRepository.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {

            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/prepositions")
    public ResponseEntity<Page<Prepositions>> getPrepositionsWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<Prepositions> foundData = prepositionsRepository.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {

            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/pronouns")
    public ResponseEntity<Page<Pronouns>> getPronounsWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<Pronouns> foundData = pronounsRepository.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {

            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/verbs")
    public ResponseEntity<Page<Verbs>> getVerbsWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<Verbs> foundData = verbsRepository.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {

            return ResponseEntity.notFound().build();
        }
    }

    // GET ALL DATA

    @GetMapping(value = "/adjectives/all")
    public ResponseEntity<List<Adjectives>> getAllAdjectives() {
        List<Adjectives> foundData = adjectivesRepository.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/adverbs/all")
    public ResponseEntity<List<Adverbs>> getAllAdverbs() {
        List<Adverbs> foundData = adverbsRepository.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/nouns/all")
    public ResponseEntity<List<Nouns>> getAllNouns() {
        List<Nouns> foundData = nounsRepository.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/prepositions/all")
    public ResponseEntity<List<Prepositions>> getAllPrepositions() {
        List<Prepositions> foundData = prepositionsRepository.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/pronouns/all")
    public ResponseEntity<List<Pronouns>> getAllPronouns() {
        List<Pronouns> foundData = pronounsRepository.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/verbs/all")
    public ResponseEntity<List<Verbs>> getAllVerbs() {
        List<Verbs> foundData = verbsRepository.findAll();
        if (foundData != null){
            return  ResponseEntity.ok(foundData);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }











}
