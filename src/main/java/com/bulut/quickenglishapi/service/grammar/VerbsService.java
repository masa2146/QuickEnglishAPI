package com.bulut.quickenglishapi.service.grammar;

import com.bulut.quickenglishapi.dto.grammar.PronounsDto;
import com.bulut.quickenglishapi.dto.grammar.VerbsDto;
import com.bulut.quickenglishapi.model.grammar.Pronouns;
import com.bulut.quickenglishapi.model.grammar.Verbs;
import com.bulut.quickenglishapi.repository.grammar.PronounsRepository;
import com.bulut.quickenglishapi.repository.grammar.VerbsRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VerbsService {

    private final VerbsRepository repository;

    private final ModelMapper modelMapper;


    /**
     * Converted Page<Object> class to Page<ObjectDto>
     */
    public Page<VerbsDto> findAll(Pageable pageable) {
        Page<Verbs> foundEntity = repository.findAll(pageable);
        return foundEntity.map(this::convertToDto);
    }

    public List<VerbsDto> findAll() {
        List<Verbs> foundEntity = repository.findAll();
        return foundEntity.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private VerbsDto convertToDto(Verbs value) {
        return modelMapper.map(value, VerbsDto.class);
    }
}
