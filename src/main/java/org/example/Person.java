package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private final String givenName;
    private final String surname;

    private final LocalDate dateOfBirth;
    Person(String givenName, String surname,LocalDate dateOfBirth) {
        this.givenName = givenName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }
    String getDisplayName() {
        return surname + ", " + givenName;
    }
    long getAge() {
        return ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
    }
}
