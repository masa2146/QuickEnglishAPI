package com.bulut.quickenglishapi.repository.podcast;

import com.bulut.quickenglishapi.model.podcast.PodcastL1;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PodcastL1Repository extends MongoRepository<PodcastL1,String> {
}
