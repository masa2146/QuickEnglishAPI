package com.bulut.quickenglishapi.service.grammar;

import com.bulut.quickenglishapi.dto.grammar.NounsDto;
import com.bulut.quickenglishapi.model.grammar.Nouns;
import com.bulut.quickenglishapi.repository.grammar.NounsRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class NounsService {

    private final NounsRepository repository;

    private final ModelMapper modelMapper;


    /**
     * Converted Page<Object> class to Page<ObjectDto>
     */
    public Page<NounsDto> findAll(Pageable pageable) {
        Page<Nouns> foundEntity = repository.findAll(pageable);
        return foundEntity.map(this::convertToDto);
    }

    public List<NounsDto> findAll() {
        List<Nouns> foundEntity = repository.findAll();
        return foundEntity.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private NounsDto convertToDto(Nouns value) {
        return modelMapper.map(value, NounsDto.class);
    }
}
