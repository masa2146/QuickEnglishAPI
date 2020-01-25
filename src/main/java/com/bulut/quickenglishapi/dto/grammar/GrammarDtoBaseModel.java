package com.bulut.quickenglishapi.dto.grammar;

import lombok.Data;

@Data
abstract class GrammarDtoBaseModel {

    private String context_header;
    private String context_text;

}
