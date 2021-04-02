package com.example.roomdatabasemvp.presenter;

import com.example.roomdatabasemvp.database.entity.Person;

public interface EditView {

    void showErrorMessage(int id);

    void clearPreError();

    void populate(Person person);
}
