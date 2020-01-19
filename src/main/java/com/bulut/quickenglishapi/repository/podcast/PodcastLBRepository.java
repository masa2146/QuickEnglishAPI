package com.bulut.quickenglishapi.repository.podcast;

import com.bulut.quickenglishapi.model.podcast.PodcastLB;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PodcastLBRepository extends MongoRepository<PodcastLB,String> {
}
