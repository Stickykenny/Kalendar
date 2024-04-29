package com.stky.kalendar.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class PersonDto {
    @JsonProperty("id") // This name correspond to the database column
    private Long id;
    @JsonProperty("name")
    private String name;
}
