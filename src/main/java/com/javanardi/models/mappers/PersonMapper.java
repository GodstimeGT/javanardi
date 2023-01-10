package com.javanardi.models.mappers;

import com.javanardi.models.Person;
import com.javanardi.models.daos.PersonDao;

public class PersonMapper {

    public static Person toPerson(PersonDao eventDao) {
        return new Person(
                eventDao.getUuid(),
                eventDao.getName()
        );
    }
    
}
