package com.bulut.quickenglishapi.repository.news;

import com.bulut.quickenglishapi.model.news.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepostiory extends MongoRepository<News,String> {
    Page<News> findAll(Pageable pageable);
}
