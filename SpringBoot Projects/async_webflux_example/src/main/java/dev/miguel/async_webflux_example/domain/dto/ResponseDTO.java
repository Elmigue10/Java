package dev.miguel.async_webflux_example.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

    @JsonProperty("status")
    private String status;
    @JsonProperty("message")
    private String message;

}
