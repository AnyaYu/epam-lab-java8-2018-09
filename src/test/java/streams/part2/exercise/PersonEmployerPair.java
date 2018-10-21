package streams.part2.exercise;

import lambda.data.Person;

public class PersonEmployerPair {
    Person person;
    String employer;

    public PersonEmployerPair(String employer, Person person) {
        this.employer = employer;
        this.person = person;
    }

    public String getEmployer() {
        return employer;
    }

    public Person getPerson() {
        return person;
    }
}
