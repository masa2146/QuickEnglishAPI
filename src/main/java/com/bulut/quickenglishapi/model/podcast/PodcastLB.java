package com.bulut.quickenglishapi.model.podcast;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(value = "podcast_bussiness")
public class PodcastLB extends PodcastBaseModel {

    private String description;
}