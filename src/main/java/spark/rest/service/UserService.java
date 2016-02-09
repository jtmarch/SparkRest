package spark.rest.service;

import spark.rest.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jdebruin on 2/2/16.
 */
public class UserService {

    // returns a list of all users
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        users.add(createUser("Jelle", "Jelle@4family.nl"));
        users.add(createUser("Joep", "Joep@lalala.nl"));
        return users;
    }

    // returns a single user by id
    public User getUser(String id) {
        return new User();
    }

    // creates a new user
    public User createUser(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return user;
    }

    // updates an existing user
    public User updateUser(String id, String name, String email) {
        for (User user : getAllUsers()) {
            if (user.getId().equalsIgnoreCase(id)) {
                user.setName(name);
                user.setEmail(email);
                return user;
            }
        }
        return null;
    }

}
