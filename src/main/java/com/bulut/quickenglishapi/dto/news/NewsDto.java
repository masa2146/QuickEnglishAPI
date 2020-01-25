package com.bulut.quickenglishapi.dto.news;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NewsDto {


    private List<LevelDto> level_1 = new ArrayList<>();
    private List<LevelDto> level_2 = new ArrayList<>();
    private List<LevelDto> level_3 = new ArrayList<>();


}
