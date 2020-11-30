package exercise10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class People implements Serializable {
    List<Person> people = new ArrayList<>();

    public void addPerson(Person p){
        people.add(p);
    }

    public Person findPerson(int num){
        for(Person p : people){
            if(p.getNum() == num){
                return p;
            }
        }
        return null;
    }

    public List<Person> getPeople() {
        return people;
    }
}
