package com.bulut.quickenglishapi.dto.podcast;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(value = "podcast_voa2")
public class PodcastVoa2Dto extends PodcastDtoBaseModel {

    private String dialog;
}