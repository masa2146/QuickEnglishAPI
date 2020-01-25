package com.bulut.quickenglishapi.service.grammar;

import com.bulut.quickenglishapi.dto.grammar.AdjectivesDto;
import com.bulut.quickenglishapi.model.grammar.Adjectives;
import com.bulut.quickenglishapi.repository.grammar.AdjectivesRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AdjectivesService {

    private final AdjectivesRepository repository;

    private final ModelMapper modelMapper;


    /**
     * Converted Page<Adjective> class to Page<AdjectiveDto>
     * */
    public Page<AdjectivesDto> findAll(Pageable pageable) {
        Page<Adjectives> foundEntity = repository.findAll(pageable);
        return foundEntity.map(new Function<Adjectives, AdjectivesDto>() {
            @Override
            public AdjectivesDto apply(Adjectives adjectives) {
                return convertToDto(adjectives);
            }
        });
    }

    public List<AdjectivesDto> findAll(){
        List<Adjectives> foundEntity = repository.findAll();
        return foundEntity.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private AdjectivesDto convertToDto(Adjectives value) {
        return modelMapper.map(value, AdjectivesDto.class);
    }


}
