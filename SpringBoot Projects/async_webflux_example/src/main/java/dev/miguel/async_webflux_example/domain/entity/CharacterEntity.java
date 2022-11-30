package dev.miguel.async_webflux_example.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "character")
@Getter
@Setter
public class CharacterEntity {

    @Id
    public int id;
    public String name;
    public String status;
    public String species;
    public String type;
    public String gender;
    public String image;
    public String url;

}
