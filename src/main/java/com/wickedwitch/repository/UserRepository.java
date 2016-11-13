package com.wickedwitch.repository;

import com.wickedwitch.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ZuZ on 2016-11-05.
 */
@Repository
public class UserRepository {

    public static List<User> users = Arrays.asList(
            new User(1, "Shaggy", "Janek", "shaggy@janek.pl"),
            new User(2, "Scooby", "Maciek", "xxx@yyy.pl"),
            new User(3, "Bobo", "Alex", "bobo@com.pl"),
            new User(4, "Jogi", "Kamil", "alex@jogi.pl"),
            new User(5, "Jerry", "Grzes", "jerry@tom.pl")
    );

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
