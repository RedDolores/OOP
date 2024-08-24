package hw4.service;

import hw4.model.User;

public interface UserService <T extends User>{
    void create(String firstName, String secondName, String lastName);
}
