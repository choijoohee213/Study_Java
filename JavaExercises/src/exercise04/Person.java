package exercise04;

import java.util.Arrays;
import java.util.stream.Stream;

public class Person implements Comparable<Person>{
    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Person person) {
        if(person.height < this.height)
            return 1;
        else if(person.height == this.height)
            return 0;
        else return -1;
    }
}
