package com.bulut.quickenglishapi.model.news;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class News {

    @Id
    private ObjectId _id;
    private List<Level> level_1 = new ArrayList<>();
    private List<Level> level_2 = new ArrayList<>();
    private List<Level> level_3 = new ArrayList<>();



}
