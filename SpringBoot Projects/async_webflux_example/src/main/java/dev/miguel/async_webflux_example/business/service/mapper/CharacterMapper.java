package dev.miguel.async_webflux_example.business.service.mapper;

import dev.miguel.async_webflux_example.domain.dto.CharacterDTO;
import dev.miguel.async_webflux_example.domain.entity.CharacterEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CharacterMapper {

    List<CharacterDTO> modelsToDTOs(List<CharacterEntity> entityList);

    List<CharacterEntity> DTOsToModels(List<CharacterDTO> dtoList);

    CharacterEntity DTOToModel(CharacterDTO characterDTO);
}
