package com.theironyard.novauc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Person> people = new ArrayList<>();
        HashMap<String, ArrayList<Person>> listMap = new HashMap<>();


        File f = new File("people.csv");
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            Person person = new Person(String.valueOf(columns[0]), columns[1], columns[2],columns[3], columns[4],columns[5]);
            people.add(person);
        }


    }

}










