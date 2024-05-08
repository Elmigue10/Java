package dev.miguel.async_webflux_example.business.controller;

import dev.miguel.async_webflux_example.business.service.CharacterService;
import dev.miguel.async_webflux_example.domain.dto.CharacterDTO;
import dev.miguel.async_webflux_example.domain.dto.ResponseDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("api/v1")
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping(value = "/async/characters", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getCharactersAsync(){
        characterService.getCharactersAsync();
        return ResponseEntity.ok(characterService.getResponse());
    }

    @GetMapping(value = "/webflux/characters", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseDTO> getCharactersWebFlux(){
        return characterService.getCharactersWebFlux();
    }

    @GetMapping(value = "/characters")
    public ResponseEntity<List<CharacterDTO>> getCharacters(){
        return new ResponseEntity<>(characterService.getCharacters(), HttpStatus.OK);
    }

//    @GetMapping(path = "/async")
//    public Mono<Void> start() {
//        Mono.delay(Duration.ofSeconds(10))
//                .doOnNext(i -> log.info("we have waited 10 seconds"))
//                .subscribe();
//
//        return Mono.empty();
//    }
}
