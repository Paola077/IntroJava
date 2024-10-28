package org.example.users;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Maria ", "Perez");
        User user2 = new User("Pablo ", "Sanz");
        User user3 = new User("Sofia ", "Marcos");

        User [] users = {user1, user2, user3};

        // utilizando algun bucle imprime los fullName de 3 usuarios

        for (User user: users)
            System.out.println(user.printFullName());
    }
}
