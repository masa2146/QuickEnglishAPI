package com.bulut.quickenglishapi.service.grammar;

import com.bulut.quickenglishapi.dto.grammar.NounsDto;
import com.bulut.quickenglishapi.dto.grammar.PrepositionsDto;
import com.bulut.quickenglishapi.model.grammar.Nouns;
import com.bulut.quickenglishapi.model.grammar.Prepositions;
import com.bulut.quickenglishapi.repository.grammar.NounsRepository;
import com.bulut.quickenglishapi.repository.grammar.PrepositionsRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrepositionsService {

    private final PrepositionsRepository repository;

    private final ModelMapper modelMapper;


    /**
     * Converted Page<Object> class to Page<ObjectDto>
     */
    public Page<PrepositionsDto> findAll(Pageable pageable) {
        Page<Prepositions> foundEntity = repository.findAll(pageable);
        return foundEntity.map(this::convertToDto);
    }

    public List<PrepositionsDto> findAll() {
        List<Prepositions> foundEntity = repository.findAll();
        return foundEntity.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private PrepositionsDto convertToDto(Prepositions value) {
        return modelMapper.map(value, PrepositionsDto.class);
    }
}
