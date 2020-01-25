package com.bulut.quickenglishapi.controller.grammar;

import com.bulut.quickenglishapi.dto.grammar.*;
import com.bulut.quickenglishapi.model.grammar.*;
import com.bulut.quickenglishapi.repository.grammar.*;
import com.bulut.quickenglishapi.service.grammar.*;
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

    private final AdjectivesService adjectivesService;
    private final AdverbsService adverbsService;
    private final NounsService nounsService;
    private final PrepositionsService prepositionsService;
    private final PronounsService pronounsService;
    private final VerbsService verbsService;

    // GET DATA WITH PAGEABLE

    @GetMapping("/adjectives")
    public ResponseEntity<Page<AdjectivesDto>> getAdjectivesWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<AdjectivesDto> foundData = adjectivesService.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {

            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/adverbs")
    public ResponseEntity<Page<AdverbsDto>> getAdverbsWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<AdverbsDto> foundData = adverbsService.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {

            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/nouns")
    public ResponseEntity<Page<NounsDto>> getNounsWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<NounsDto> foundData = nounsService.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/prepositions")
    public ResponseEntity<Page<PrepositionsDto>> getPrepositionsWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<PrepositionsDto> foundData = prepositionsService.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/pronouns")
    public ResponseEntity<Page<PronounsDto>> getPronounsWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<PronounsDto> foundData = pronounsService.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {

            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/verbs")
    public ResponseEntity<Page<VerbsDto>> getVerbsWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<VerbsDto> foundData = verbsService.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {

            return ResponseEntity.notFound().build();
        }
    }

    // GET ALL DATA

    @GetMapping(value = "/adjectives/all")
    public ResponseEntity<List<AdjectivesDto>> getAllAdjectives() {
        List<AdjectivesDto> foundData = adjectivesService.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/adverbs/all")
    public ResponseEntity<List<AdverbsDto>> getAllAdverbs() {
        List<AdverbsDto> foundData = adverbsService.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/nouns/all")
    public ResponseEntity<List<NounsDto>> getAllNouns() {
        List<NounsDto> foundData = nounsService.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/prepositions/all")
    public ResponseEntity<List<PrepositionsDto>> getAllPrepositions() {
        List<PrepositionsDto> foundData = prepositionsService.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/pronouns/all")
    public ResponseEntity<List<PronounsDto>> getAllPronouns() {
        List<PronounsDto> foundData = pronounsService.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/verbs/all")
    public ResponseEntity<List<VerbsDto>> getAllVerbs() {
        List<VerbsDto> foundData = verbsService.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
