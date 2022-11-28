package com.example.LastWork.service;

import com.example.LastWork.dto.PersonCreateDto;
import com.example.LastWork.persistence.entity.Person;
import com.example.LastWork.persistence.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person createPerson(PersonCreateDto dto) {
        return personRepository.save(new Person(dto.getId(), dto.getName(), dto.getAddress(), dto.getPhone()));
    }

    public Person deletePerson(Long id) {
        Optional<Person> str = personRepository.findById(id);
        try {
            personRepository.deleteById(id);
            return str.get();
        } catch (EmptyResultDataAccessException e) {
            System.out.println("Элемент справочника Person с id[" + id + "] отсутствует в базе данных " + e);
        }

        return null;
    }
}
