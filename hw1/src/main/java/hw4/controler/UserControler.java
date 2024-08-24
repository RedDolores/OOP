package hw4.controler;

import hw4.model.User;

public interface UserControler<T extends User> {
    void create(String firstName, String secondName, String lastName);
}
