package com.bulut.quickenglishapi.dto.podcast;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
class PodcastDtoBaseModel {


    private String title;
    private String url;

}
