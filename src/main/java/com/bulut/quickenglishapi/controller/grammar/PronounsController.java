package com.bulut.quickenglishapi.controller.grammar;

import com.bulut.quickenglishapi.model.grammar.Pronouns;
import com.bulut.quickenglishapi.repository.grammar.PronounsRepository;
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
@RequestMapping(value = "/grammar/pronouns")
public class PronounsController {

    private final PronounsRepository repository;

    public PronounsController(PronounsRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public ResponseEntity<Page<Pronouns>> getPronounsWithPage(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<Pronouns> foundData = repository.findAll(pageable);
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {

            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Pronouns>> getAllPronouns() {
        List<Pronouns> foundData = repository.findAll();
        if (foundData != null) {
            return ResponseEntity.ok(foundData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
