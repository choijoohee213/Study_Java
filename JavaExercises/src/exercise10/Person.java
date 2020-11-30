package exercise10;

import java.io.Serializable;

public class Person implements Serializable {
    private static int number = 1;
    private int num;
    private String name;
    private String phoneNum;

    public Person(String name, String phoneNum) {
        num = number++;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
