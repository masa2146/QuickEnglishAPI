package com.bulut.quickenglishapi.service.grammar;

import com.bulut.quickenglishapi.dto.grammar.PrepositionsDto;
import com.bulut.quickenglishapi.dto.grammar.PronounsDto;
import com.bulut.quickenglishapi.model.grammar.Prepositions;
import com.bulut.quickenglishapi.model.grammar.Pronouns;
import com.bulut.quickenglishapi.repository.grammar.PrepositionsRepository;
import com.bulut.quickenglishapi.repository.grammar.PronounsRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PronounsService {

    private final PronounsRepository repository;

    private final ModelMapper modelMapper;


    /**
     * Converted Page<Object> class to Page<ObjectDto>
     */
    public Page<PronounsDto> findAll(Pageable pageable) {
        Page<Pronouns> foundEntity = repository.findAll(pageable);
        return foundEntity.map(this::convertToDto);
    }

    public List<PronounsDto> findAll() {
        List<Pronouns> foundEntity = repository.findAll();
        return foundEntity.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private PronounsDto convertToDto(Pronouns value) {
        return modelMapper.map(value, PronounsDto.class);
    }
}
