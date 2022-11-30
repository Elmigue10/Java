package dev.miguel.async_webflux_example.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CharacterList {

    @SerializedName("results")
    List<CharacterDTO> characterDTOList;

}
