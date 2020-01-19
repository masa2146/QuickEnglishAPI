package com.bulut.quickenglishapi.model.grammar;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public abstract class GrammarBaseModel {

    @Id
    public ObjectId _id;
    public String context_header;
    public String context_text;

}
