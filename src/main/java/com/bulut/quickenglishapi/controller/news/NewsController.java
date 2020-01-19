package com.bulut.quickenglishapi.controller.news;

import com.bulut.quickenglishapi.model.news.News;
import com.bulut.quickenglishapi.repository.news.NewsRepostiory;
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
@RequestMapping(value = "/news")
public class NewsController {

    private final NewsRepostiory repostiory;

    public NewsController(NewsRepostiory repostiory) {
        this.repostiory = repostiory;
    }

    @GetMapping
    public ResponseEntity<Page<News>> getNewsWithPage(@RequestParam("page") int page){
        Pageable pageable = PageRequest.of(page, 10);
        Page<News> foundData = repostiory.findAll(pageable);
        if (foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<News>> getAllNews(){
        List<News> foundData = repostiory.findAll();
        System.out.println("GELEN "+foundData.get(0).getLevel_1().get(0).getTitle());
        if (foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}