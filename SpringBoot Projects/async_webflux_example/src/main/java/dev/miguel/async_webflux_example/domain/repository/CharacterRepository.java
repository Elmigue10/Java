package dev.miguel.async_webflux_example.domain.repository;

import dev.miguel.async_webflux_example.domain.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {
}
