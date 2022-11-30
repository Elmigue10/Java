package dev.miguel.async_webflux_example.business.service.client;

import dev.miguel.async_webflux_example.domain.dto.CharacterDTO;
import dev.miguel.async_webflux_example.domain.dto.CharacterList;
import feign.Param;
import feign.RequestLine;


public interface RestHttpApiClient {

    @RequestLine("GET /character")
    CharacterList getCharacters();

    @RequestLine("GET /character/{id}")
    CharacterDTO getCharacterById(@Param("id") int id);
}
