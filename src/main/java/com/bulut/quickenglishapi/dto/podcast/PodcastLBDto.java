package com.bulut.quickenglishapi.dto.podcast;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(value = "podcast_bussiness")
public class PodcastLBDto extends PodcastDtoBaseModel {

    private String description;
}