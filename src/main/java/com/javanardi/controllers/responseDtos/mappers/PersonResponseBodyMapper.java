package com.javanardi.controllers.responseDtos.mappers;

import com.javanardi.controllers.responseDtos.PersonResponseBody;
import com.javanardi.models.Person;

public class PersonResponseBodyMapper {
    
    public static PersonResponseBody fromPerson(Person person) {
        return new PersonResponseBody(
                person.getUuid().toString(),
                person.getName()
        );
    }
}
