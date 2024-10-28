package org.example.users;

public class User {
    private String name;
    private String lastname;


    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String printFullName() {
        return name + lastname;
    }
}
