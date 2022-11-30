package dev.miguel.async_webflux_example.business.service;

import dev.miguel.async_webflux_example.business.service.client.RestHttpApiClient;
import dev.miguel.async_webflux_example.business.service.client.RestHttpApiClientBuilder;
import dev.miguel.async_webflux_example.business.service.mapper.CharacterMapper;
import dev.miguel.async_webflux_example.domain.dto.CharacterDTO;
import dev.miguel.async_webflux_example.domain.dto.CharacterList;
import dev.miguel.async_webflux_example.domain.dto.ResponseDTO;
import dev.miguel.async_webflux_example.domain.repository.CharacterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@Service
@Slf4j
public class CharacterService {

    private RestHttpApiClientBuilder restHttpApiClientBuilder;
    private CharacterRepository characterRepository;
    private CharacterMapper characterMapper;
    private RestHttpApiClient restHttpApiClient;
    private Long time;

    public CharacterService(RestHttpApiClientBuilder restHttpApiClientBuilder,
                            CharacterRepository characterRepository,
                            CharacterMapper characterMapper){
        this.restHttpApiClientBuilder = restHttpApiClientBuilder;
        this.characterRepository = characterRepository;
        this.characterMapper = characterMapper;
        this.restHttpApiClient = restHttpApiClientBuilder.buildRestHttpApiClient();
        this.time = System.currentTimeMillis();
    }

    @Async
    public void getCharactersAsync() {
        log.info(String.valueOf(time));
        CharacterList characters = restHttpApiClient.getCharacters();
        characters.getCharacterDTOList().forEach( c -> {
            CharacterDTO characterDTO = restHttpApiClient.getCharacterById(c.getId());
            characterRepository.save(characterMapper.DTOToModel(characterDTO));
        });
        log.info(System.currentTimeMillis() + " = " + (System.currentTimeMillis() - time));
    }

    public Mono<ResponseDTO> getCharactersWebFlux() {
        Mono.delay(Duration.ofSeconds(0))
                .doOnNext(i -> {
                    log.info("we have waited 10 seconds");
                    log.info(String.valueOf(time));
                    CharacterList characters = restHttpApiClient.getCharacters();
                    characters.getCharacterDTOList().forEach( c -> {
                        CharacterDTO characterDTO = restHttpApiClient.getCharacterById(c.getId());
                        characterRepository.save(characterMapper.DTOToModel(characterDTO));
                    });
                    log.info(System.currentTimeMillis() + " = " + (System.currentTimeMillis() - time));
                })
                .subscribe();

        return getMonoResponse();
    }

    public ResponseDTO getResponse(){
        return new ResponseDTO("OK", "Successful operation.");
    }

    public List<CharacterDTO> getCharacters() {
        return characterMapper.modelsToDTOs(characterRepository.findAll());
    }

    private Mono<ResponseDTO> getMonoResponse() {
        return Mono.just(new ResponseDTO("OK", "Successful operation."));
    }
}
