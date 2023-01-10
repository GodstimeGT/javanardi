package com.javanardi.controllers.responseDtos;

import java.util.List;

public record PersonsResponseBody(List<PersonResponseBody> persons) {
    
}
