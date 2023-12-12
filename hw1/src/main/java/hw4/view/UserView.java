package hw4.view;

import hw4.model.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
