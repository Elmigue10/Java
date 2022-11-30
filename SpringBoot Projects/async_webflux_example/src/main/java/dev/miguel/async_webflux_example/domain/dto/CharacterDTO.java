package dev.miguel.async_webflux_example.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterDTO {

    @JsonProperty("id")
    public int id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("status")
    public String status;

    @JsonProperty("species")
    public String species;

    @JsonProperty("type")
    public String type;

    @JsonProperty("gender")
    public String gender;

    @JsonProperty("image")
    public String image;

    @JsonProperty("url")
    public String url;

}
