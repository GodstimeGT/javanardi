package com.javanardi.controllers.requestDtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record CreatePersonRequestBody(

    @NotNull(message = "Name is required")
    @NotBlank(message = "Name is required")
    String name

) {

}
