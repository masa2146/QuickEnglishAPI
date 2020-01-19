package com.bulut.quickenglishapi.model.podcast;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
class PodcastBaseModel {

    @Id
    private ObjectId _id;
    private String title;
    private String url;

}
