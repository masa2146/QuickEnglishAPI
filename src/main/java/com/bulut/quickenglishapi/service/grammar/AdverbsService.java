package com.bulut.quickenglishapi.service.grammar;

import com.bulut.quickenglishapi.dto.grammar.AdverbsDto;
import com.bulut.quickenglishapi.model.grammar.Adverbs;
import com.bulut.quickenglishapi.repository.grammar.AdverbsRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AdverbsService {

    private final AdverbsRepository repository;

    private final ModelMapper modelMapper;


    /**
     * Converted Page<Object> class to Page<ObjectDto>
     */
    public Page<AdverbsDto> findAll(Pageable pageable) {
        Page<Adverbs> foundEntity = repository.findAll(pageable);
        return foundEntity.map(this::convertToDto);
    }

    public List<AdverbsDto> findAll() {
        List<Adverbs> foundEntity = repository.findAll();
        return foundEntity.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private AdverbsDto convertToDto(Adverbs value) {
        return modelMapper.map(value, AdverbsDto.class);
    }
}
