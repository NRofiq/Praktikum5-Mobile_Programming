package com.example.roomdatabasemvp.presenter;

import com.example.roomdatabasemvp.database.entity.Person;

public interface EditPresenter {

    void save(Person person);

    boolean validate(Person person);

    void getPerson(long id);

    void update(Person person);
}
