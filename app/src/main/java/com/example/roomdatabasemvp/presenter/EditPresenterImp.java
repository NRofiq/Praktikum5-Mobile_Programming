package com.example.roomdatabasemvp.presenter;

import com.example.roomdatabasemvp.database.dao.PersonDao;
import com.example.roomdatabasemvp.database.entity.Person;
import com.example.roomdatabasemvp.utils.Constants;
import com.example.roomdatabasemvp.utils.Util;

public class EditPresenterImp implements EditPresenter{

    private final EditView view;
    private final PersonDao personDao;

    public EditPresenterImp(EditView view, PersonDao personDao) {
        this.view = view;
        this.personDao = personDao;
    }

    @Override
    public void save(Person person) {
        this.personDao.insertPerson(person);

    }

    @Override
    public boolean validate(Person person) {
        if (person.getNama().isEmpty() || !Util.isValidName(person.getNama())){
            view.showErrorMessage(Constants.ID_NAME);
            return false;
        }
        if (person.getAddress().isEmpty()){
            view.showErrorMessage(Constants.ADDRES);
            return false;
        }
        if (person.getPhone().isEmpty() || !Util.isValidPhone(person.getPhone())){
            view.showErrorMessage(Constants.PHONE);
            return false;
        }
        if (person.getEmail().isEmpty() || !Util.isValidEmail(person.getEmail())){
            view.showErrorMessage(Constants.EMAIL);
            return false;
        }
        return true;
    }

    @Override
    public void getPerson(long id) {

    }

    @Override
    public void update(Person person) {

    }
}
