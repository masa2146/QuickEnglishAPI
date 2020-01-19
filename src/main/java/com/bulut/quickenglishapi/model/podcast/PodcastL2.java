package com.bulut.quickenglishapi.model.podcast;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(value = "podcast_level2")
public class PodcastL2 extends PodcastBaseModel {

    private String description;
}