package com.theironyard.novauc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;


public class Main {
    static ArrayList<Person> people = new ArrayList<>();
    static HashMap<String, ArrayList<Person>> listMap = new HashMap<>();


    public static void readFile() throws FileNotFoundException {

        File f = new File("people.csv");
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            Person person = new Person(String.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);
            people.add(person);


        }


    }

    public static void loadListMap() {
        for (Person person : people) {

            String country = person.country;
            ArrayList<Person> peopleFromCountry = listMap.get(country);

            if (peopleFromCountry == null) {
                peopleFromCountry = new ArrayList<>();

            }
            peopleFromCountry.add(person);
            listMap.put(country, peopleFromCountry);

        }


    }
    public static void printListMap()  {
        System.out.println(listMap);
    }
    public static  void writeToFile() throws IOException{
        File f = new File("people.json");

        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(listMap);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();


    }

    public static void printPerson(){

    }


    public static void main (String[] args) throws IOException{

    readFile();
    loadListMap();
    printListMap();
    writeToFile();
    printPerson();
    }

}










