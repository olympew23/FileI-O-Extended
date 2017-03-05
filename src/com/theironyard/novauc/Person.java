package com.theironyard.novauc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jerieshasmith on 2/16/17.
 */
public class Person {

        String id;
        String firstName;
        String lastName;
        String email;
        String country;
        String ipAddress;



    public Person(String id, String firstName, String lastName, String email, String country, String ipAddress){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.country = country;
            this.ipAddress = ipAddress;
        }

    @Override
    public String toString() {
        return String.format("%s %s is from %s", firstName,lastName,country);
    }
}
