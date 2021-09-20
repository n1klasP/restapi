package com.babiel.exercises.AddressBook.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.Null;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RestDemo {

    public RestDemo() {}

        @Autowired
        RestTemplate restTemplate;

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hallo zu meinem guten API-Tester");
        System.out.println("Welche funktion");

    }

        public void getPersons() {
            String fooResourceUrl = "http://localhost:8080/api/v1/person/1";
            ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
            System.out.println(response.getStatusCode());
        }
    }


