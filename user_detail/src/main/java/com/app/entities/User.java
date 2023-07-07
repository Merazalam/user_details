package com.app.entities;

import lombok.Data;

@Data

public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String userName;
    private String email;


}
