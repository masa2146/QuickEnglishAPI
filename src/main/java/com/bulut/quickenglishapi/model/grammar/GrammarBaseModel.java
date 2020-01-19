package com.bulut.quickenglishapi.model.grammar;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
abstract class GrammarBaseModel {

    @Id
    private ObjectId _id;
    private String context_header;
    private String context_text;

}
