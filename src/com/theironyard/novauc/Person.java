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


    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public Person(String id, String firstName, String lastName, String email, String country, String ipAddress){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.country = country;
            this.ipAddress = ipAddress;






        }



    }








