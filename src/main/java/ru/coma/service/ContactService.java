package ru.coma.service;

import ru.coma.entity.Contact;

import java.util.List;

public interface ContactService {

    Contact save(Contact contact);

    List<Contact> findAll();

}
