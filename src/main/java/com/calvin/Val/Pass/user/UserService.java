package com.calvin.Val.Pass.user;

import java.util.List;

public class UserService {
    public List<User> getUsers(){
        return List.of(
                new User(
                        1,
                        "joe",
                        "secretlogin",
                        "joe@mail.com",
                        0
                )
        );
    }
}
