package Managers;

import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void createUser(String name) {
        User user = new User(name);
        this.users.add(user);
    }

}
